package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreForTeamA;
    int scoreForTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreForTeamA = 0;
        scoreForTeamB = 0;
        displayForTeamA(scoreForTeamA);
        displayForTeamB(scoreForTeamB);
    }

    /**
     * Display the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display the given score for Team A.
     */
    public void addThreeForTeamA(View view) {
        scoreForTeamA += 3;
        displayForTeamA(scoreForTeamA);

    }

    /**
     * Display the given score for Team A.
     */
    public void addTwoForTeamA(View view) {
        scoreForTeamA += 2;
        displayForTeamA(scoreForTeamA);

    }

    /**
     * Display the given score for Team A.
     */
    public void addFreeThrowForTeamA(View view) {
        scoreForTeamA += 1;
        displayForTeamA(scoreForTeamA);

    }

    // *** TEAM B ***

    /**
     * Display the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Display the given score for Team B.
     */
    public void addThreeForTeamB(View view) {
        scoreForTeamB += 3;
        displayForTeamB(scoreForTeamB);

    }

    /**
     * Display the given score for Team B.
     */
    public void addTwoForTeamB(View view) {
        scoreForTeamB += 2;
        displayForTeamB(scoreForTeamB);

    }

    /**
     * Display the given score for Team B.
     */
    public void addFreeThrowForTeamB(View view) {
        scoreForTeamB += 1;
        displayForTeamB(scoreForTeamB);

    }



    /**
     *
     * Reset the score on both teams.
     */
    public void resetScore(View view) {
        scoreForTeamA = 0;
        scoreForTeamB = 0;
        displayForTeamA(scoreForTeamA);
        displayForTeamB(scoreForTeamB);
    }


}
