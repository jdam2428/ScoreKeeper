package com.example.android.tennismatchscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.android.tennismatchscore.R;

public class MainActivity extends AppCompatActivity {

    int scorePlayerA = 0;
    int scorePlayerB = 0;

    int gamesPlayerA = 0;
    int gamesPlayerB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Player A.
     */
    public void displayForPlayerA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addPointForPlayerA(View view) {
        scorePlayerA = scorePlayerA + 15;
        displayForPlayerA(scorePlayerA);
    }

    /**
     * Displays the given score for Player A.
     */
    public void addGameForPlayerA(View view) {
        scorePlayerA = 0;
        scorePlayerB = 0;
        displayForPlayerA(scorePlayerA);
        displayForPlayerB(scorePlayerB);
        gamesPlayerA = gamesPlayerA + 1;
    }

    public void addSetForPlayerA(View view) {
        scorePlayerA = 0;
        scorePlayerB = 0;
        displayForPlayerA(scorePlayerA);
        displayForPlayerB(scorePlayerB);
    }

    /**
     * Displays the given score for Player B.
     */
    public void displayForPlayerB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addPointForPlayerB(View view) {
        scorePlayerB = scorePlayerB + 15;
        displayForPlayerB(scorePlayerB);
    }

    public void addGameForPlayerB(View view) {
        scorePlayerA = 0;
        scorePlayerB = 0;
        displayForPlayerA(scorePlayerA);
        displayForPlayerB(scorePlayerB);
    }

    public void addSetForPlayerB(View view) {
        scorePlayerA = 0;
        scorePlayerB = 0;
        displayForPlayerA(scorePlayerA);
        displayForPlayerB(scorePlayerB);
    }

    public void addMatchForPlayerB(View view) {
        scorePlayerB = scorePlayerB + 1;
        displayForPlayerB(scorePlayerB);
    }

    /**
     * Resets all scores.
     */
    public void reset(View view) {
        scorePlayerA = 0;
        scorePlayerB = 0;
        displayForPlayerA(scorePlayerA);
        displayForPlayerB(scorePlayerB);
    }

}