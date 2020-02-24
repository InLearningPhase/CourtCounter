package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForTeamA(View view) {
        score += 3;
        displayForTeamA(score);
    }

    public void addTwoForTeamA(View view) {
        score += 2;
        displayForTeamA(score);
    }

    public void freeThrow(View view) {
        score += 1;
        displayForTeamA(score);
    }
}
