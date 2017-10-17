package com.example.gbrot.basketballscoreboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Tracks the score for Team A
    int scoreTeamA = 0;
    // Tracks the score for Team B
    int scoreTeamB = 0;
    // Track the number of fouls for Team A
    int foulsTeamA = 0;
    // Track the number of fouls for Team B
    int foulsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOne(View v) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneTeamB(View v) {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwo(View v) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoTeamB(View v) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThree(View v) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    public void addThreeTeamB(View v) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }


    /**
     * Resets the score for team A back to 0 and the fouls.
     */
    public void resetScoreA(View v) {
        scoreTeamA = 0;
        foulsTeamA = 0;
        displayForTeamA(scoreTeamA);
        displayFoulTeamA(foulsTeamA);
    }

    /**
     * Resets the score for team B back to 0 and the fouls.
     */
    public void resetScoreB(View v) {
        scoreTeamB = 0;
        foulsTeamB = 0;
        displayForTeamB(scoreTeamB);
        displayFoulTeamB(foulsTeamB);
    }

    /**
     * Remove a foul from team A by 1.
     */
    public void removeFoulA(View v) {
        if(foulsTeamA > 0)
        {
            foulsTeamA -= 1;
            displayFoulTeamA(foulsTeamA);
        }
        else
        {
            displayFoulTeamA(foulsTeamA);
        }

    }

    /**
     * Remove a foul from team B by 1.
     */
    public void removeFoulB(View v) {
        if(foulsTeamB > 0)
        {
            foulsTeamB -= 1;
            displayFoulTeamB(foulsTeamB);
        }
        else
        {
            displayFoulTeamB(foulsTeamB);
        }
    }

    /**
     * Add a foul to team A by 1
     */
    public void addFoulA(View v) {
        foulsTeamA += 1;
        displayFoulTeamA(foulsTeamA);
    }

    /**
     * Add a foul to team B by 1
     */
    public void addFoulB(View v) {
        foulsTeamB += 1;
        displayFoulTeamB(foulsTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayFoulTeamA(int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_a_foul);
        foulView.setText(String.valueOf(foul));

    }

    public void displayFoulTeamB(int foul) {
        TextView foulView = (TextView) findViewById(R.id.team_b_foul);
        foulView.setText(String.valueOf(foul));

    }
}
