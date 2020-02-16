package com.example.scorekeeper;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private int score1;
    private int score2;

    private TextView score1_text;
    private TextView score2_text;

    static final String STATE_SCORE_1 = "Team 1 Score";
    static final String STATE_SCORE_2 = "Team 2 Score";

    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        score1_text = (TextView) findViewById (R.id.score1);
        score2_text = (TextView) findViewById (R.id.score2);

        if (savedInstanceState != null)
        {
            score1 = savedInstanceState.getInt(STATE_SCORE_1);
            score2 = savedInstanceState.getInt(STATE_SCORE_2);

            //Set the score text views
            score1_text.setText(String.valueOf(score1));
            score2_text.setText(String.valueOf(score2));
        }
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState)
    {
        outState.putInt(STATE_SCORE_1, score1);
        outState.putInt(STATE_SCORE_2, score2);

        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    public boolean onOptionsItemSelected (MenuItem item)
    {
        int nightMode = AppCompatDelegate.getDefaultNightMode();

//        if (item.getItemId () == R.id.night_mode)
//        {
//            if (nightMode == AppCompatDelegate.MODE_NIGHT_YES)
//            {
//                AppCompatDelegate.setDefaultNightMode (AppCompatDelegate.MODE_NIGHT_NO);
//            }
//            else
//            {
//                AppCompatDelegate.setDefaultNightMode (AppCompatDelegate.MODE_NIGHT_YES);
//            }
//
//            recreate ();
//        }

        return true;
    }

    public void decrease(View v)
    {
        int viewID = v.getId();
        switch (viewID)
        {
            case R.id.decreaseTeam1:
                score1--;
                score1_text.setText(String.valueOf(score1));
                break;
            case R.id.decreaseTeam2:
                score2--;
                score2_text.setText(String.valueOf(score2));
        }
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu)
    {
//        getMenuInflater ().inflate (R.values.main_menu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    public void increase(View v)
    {
        int viewID = v.getId();
        switch (viewID)
        {
            case R.id.decreaseTeam1:
                score1++;
                score1_text.setText(String.valueOf(score1));
                break;
            case R.id.decreaseTeam2:
                score2++;
                score2_text.setText(String.valueOf(score2));
        }
    }
} //END OF PROJECT
