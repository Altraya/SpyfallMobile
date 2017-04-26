package project.spyfallmobile;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.NumberPicker;

import project.spyfallmobile.Model.Game;

public class CreateServerActivity extends AppCompatActivity {

    EditText gameTextInput;
    NumberPicker playerNumberPicker;
    CheckBox privateGameCheckBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //generated code
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_server);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        gameTextInput = (EditText) findViewById(R.id.gameName);

        playerNumberPicker = (NumberPicker) findViewById(R.id.numberPickerPlayerNumber);

        privateGameCheckBox = (CheckBox) findViewById(R.id.privateGame);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();*/
                //Here we validate the form to create our server
                //really don't need to check user inputs, we trust them aren't it ?
                //and it's 14h51, we need to do a presentation at 16h, so, we don't have enough time :)
                createServer();
                Snackbar.make(view, "Adding server done", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();

            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //from us

        //initialize the number picker for selecting players number
        NumberPicker np = (NumberPicker) findViewById(R.id.numberPickerPlayerNumber);
        String[] nums = new String[40];
        for(int i=0; i<nums.length; i++){
            nums[i] = Integer.toString(i+1);
        }

        np.setMinValue(1);
        np.setMaxValue(40);
        np.setWrapSelectorWheel(false);
        np.setDisplayedValues(nums);
        np.setValue(1);
    }

    private void createServer()
    {
        String name = gameTextInput.getText().toString();
        int nbMaxPlayer = playerNumberPicker.getValue();
        boolean privateGame = privateGameCheckBox.isChecked();

        Game game = new Game(name, nbMaxPlayer, privateGame);
        //add this game to the system manager
        GameManager.getInstance().addGame(game);
    }

}
