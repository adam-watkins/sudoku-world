package com.sigma.sudokuworld;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;

public class SettingsActivity extends AppCompatActivity {

    static final String DIFFICULTY_INTENT_KEY = "difficulty";
    static final String GAME_MODE_INTENT_KEY = "mode";


    RadioGroup mGameModeRadioGroup;
    SeekBar mDifficultySeekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        mGameModeRadioGroup = findViewById(R.id.modeSelector);
        mDifficultySeekBar = findViewById(R.id.difficultyBar);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        //Checking GameMode
        GameMode gameMode;
        int checkedRadioButtonID = mGameModeRadioGroup.getCheckedRadioButtonId();
        if (checkedRadioButtonID == R.id.nativeMode) {
            gameMode = GameMode.NATIVE;
        } else if (checkedRadioButtonID == R.id.foreignMode) {
            gameMode = GameMode.FOREIGN;
        } else {
            gameMode = GameMode.NUMBERS;
        }

        //Checking Difficulty
        GameDifficulty gameDifficulty;
        int difficulty = mDifficultySeekBar.getProgress();
        if (difficulty == 1) {
            gameDifficulty = GameDifficulty.MEDIUM;
        } else if (difficulty == 2) {
            gameDifficulty = GameDifficulty.HARD;
        } else {
            gameDifficulty = GameDifficulty.EASY;
        }

        Intent intent = new Intent(SettingsActivity.this, MenuActivity.class);
        intent.putExtra(GAME_MODE_INTENT_KEY, gameMode);
        intent.putExtra(DIFFICULTY_INTENT_KEY, gameDifficulty);
        setResult(Activity.RESULT_OK, intent);
        finish();
    }
}
