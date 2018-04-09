package com.cataldo.chris.trapthereaper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Random;

public class GameActivity extends AppCompatActivity {

    int[] gameArray = new int[20];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        final Random rand = new Random();
        int reaperStart = rand.nextInt(gameArray.length);
    }
}
