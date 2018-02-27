package com.lupitaconqueso.scorekeeper;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //to track the scores for each team /
    //for the tracking of the score for team A
    int teamAScore = 0;
//for the tracking of the score for team B
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
/**
 The code below is for the score keeper project */


    
    //to add a touchdown to team a /
    
    public void addSixForTeamA(View v){
        teamAScore = teamAScore + 6;
        displayForTeamA(teamAScore);
    }

    public void addSixForTeamB(View v){
        teamBScore = teamBScore + 6;
        displayForTeamB(teamBScore);
    }
//to add a field goal per team/
    public void addThreeForTeamA(View v){
        teamAScore = teamAScore + 3;
        displayForTeamA(teamAScore);
    }

    public void addThreeForTeamB(View v){
        teamBScore = teamBScore + 3;
        displayForTeamB(teamBScore);
    }
   //to add a 2 point conversion per team/
    public void addTwoForTeamA(View v){
        teamAScore = teamAScore + 2;
        displayForTeamA(teamAScore);
    }

    public void addTwoForTeamB(View v){
        teamBScore = teamBScore + 2;
        displayForTeamB(teamBScore);
    }
    //to add a one point conversion per team/
    public void addOneForTeamA(View v){
        teamAScore = teamAScore + 1;
        displayForTeamA(teamAScore);
    }

    public void addOneForTeamB(View v){
        teamBScore = teamBScore + 1;
        displayForTeamB(teamBScore);
    }


    private void displayForTeamA(int teamAScore) {
        TextView scoreVeiw = (TextView) findViewById(R.id.teamAScore);
        scoreVeiw.setText(String.valueOf(teamAScore));
    }

    private void displayForTeamB(int teamBScore){
        TextView scoreView = (TextView) findViewById(R.id.teamBScore);
        scoreView.setText(String.valueOf(teamBScore));
    }

    public void resetScore(View v){
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamA(teamAScore);
        displayForTeamB(teamBScore);
    }
    }








