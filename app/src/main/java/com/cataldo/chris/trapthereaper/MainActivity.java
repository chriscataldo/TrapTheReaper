package com.cataldo.chris.trapthereaper;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.startButton);
        if (button1 != null) {
            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    playClick();
                    launchGame();
                }
            });
        }
    }

    private void launchGame() {
        Intent i = new Intent(MainActivity.this, GameActivity.class);
        startActivity(i);
        // close this activity
        finish();
    }

    private void playClick() {
        int soundId = getResources().getIdentifier("click", "raw", getPackageName());
        mp = MediaPlayer.create(getApplicationContext(), soundId);
        int maxVolume = 50;
        float log1=(float)(Math.log(maxVolume-40)/Math.log(maxVolume));
        mp.setVolume(1-log1,1-log1);
        mp.start();
    }
}
