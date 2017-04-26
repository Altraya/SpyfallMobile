package project.spyfallmobile;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Chronometer;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class GameActivity extends AppCompatActivity {

    CountDownTimer chrono;
    TextView chronoTextView;
    private static final String FORMAT = "%02d:%02d";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        chronoTextView = (TextView) findViewById(R.id.chrono);

        //Counter start at 10:00
        chrono = new CountDownTimer(600000, 1000) {

            public void onTick(long millisUntilFinished) {
                chronoTextView.setText(String.format(FORMAT,TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished),
                        TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(
                                TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));
            }

            public void onFinish() {
                chronoTextView.setText("@string/game_finish");
            }
        }.start();
    }
}
