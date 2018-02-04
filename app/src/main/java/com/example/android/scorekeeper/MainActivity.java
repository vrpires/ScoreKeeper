package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreOfTeamA = 0;
    int scoreOfTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addTouchdownForTeamA(View view){
        scoreOfTeamA = scoreOfTeamA + 6;
        displayForTeamA(scoreOfTeamA);
    }

    public void addFieldGoalForTeamA(View view){
        scoreOfTeamA = scoreOfTeamA + 3;
        displayForTeamA(scoreOfTeamA);
    }

    public void addMiniTouchdownForTeamA(View view){
        scoreOfTeamA = scoreOfTeamA + 2;
        displayForTeamA(scoreOfTeamA);
    }

    public void addSafetyForTeamA(View view){
        scoreOfTeamA = scoreOfTeamA + 2;
        displayForTeamA(scoreOfTeamA);
    }

    public void addExtraPointForTeamA(View view){
        scoreOfTeamA = scoreOfTeamA + 1;
        displayForTeamA(scoreOfTeamA);
    }

    public void addTouchdownForTeamB(View view){
        scoreOfTeamB = scoreOfTeamB + 6;
        displayForTeamB(scoreOfTeamB);
    }

    public void addFieldGoalForTeamB(View view){
        scoreOfTeamB = scoreOfTeamB + 3;
        displayForTeamB(scoreOfTeamB);
    }

    public void addMiniTouchdownForTeamB(View view){
        scoreOfTeamB = scoreOfTeamB + 2;
        displayForTeamB(scoreOfTeamB);
    }

    public void addSafetyForTeamB(View view){
        scoreOfTeamB = scoreOfTeamB + 2;
        displayForTeamB(scoreOfTeamB);
    }

    public void addExtraPointForTeamB(View view){
        scoreOfTeamB = scoreOfTeamB + 1;
        displayForTeamB(scoreOfTeamB);
    }

    public void resetButton(View view){
        scoreOfTeamA = 0;
        scoreOfTeamB = 0;

        displayForTeamA(scoreOfTeamA);
        displayForTeamB(scoreOfTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Exibe a pontuação dada ao grupo B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
