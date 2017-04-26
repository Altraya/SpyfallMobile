package project.spyfallmobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    private Button _buttonCreateServer;
    private Button _buttonJoinServer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        _buttonCreateServer = (Button) this.findViewById(R.id.buttonCreateServer);
        _buttonJoinServer = (Button) this.findViewById(R.id.buttonJoinServer);

        _buttonCreateServer.setOnClickListener(this);
        _buttonJoinServer.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v == _buttonCreateServer)
        {
            //launch create server view
            Intent myIntent = new Intent(MenuActivity.this, CreateServerActivity.class);
            MenuActivity.this.startActivity(myIntent);


        }
        else if(v == _buttonJoinServer)
        {
            //launch join server view
            Intent myIntent = new Intent(MenuActivity.this, JoinServerActivity.class);
            MenuActivity.this.startActivity(myIntent);

        }

    }
}
