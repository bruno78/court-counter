package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreA);
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
    public void addThree(View view) {
        scoreA += 3;
        displayForTeamA(scoreA);

    }

    /**
     * Display the given score for Team A.
     */
    public void addTwo(View view) {
        scoreA += 2;
        displayForTeamA(scoreA);

    }

    /**
     * Display the given score for Team A.
     */
    public void addFreeThrow(View view) {
        scoreA += 1;
        displayForTeamA(scoreA);

    }

    public void reset(View view) {
        scoreA = 0;
        displayForTeamA(scoreA);
    }


}
