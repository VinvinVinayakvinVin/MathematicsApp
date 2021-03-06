package com.example.android.mathematicsapp.trainingmode.exerciseTheory;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.android.mathematicsapp.R;
import com.example.android.mathematicsapp.trainingmode.begin.TrainingModeBeginScreen;
import com.example.android.mathematicsapp.trainingmode.levelSelectionExerciseNum.LevelSelectionExerciseThree;

public class TheoryThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theory_three);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setNavigationBarColor(getApplicationContext().getResources().getColor(R.color.dark_bg));
        }

        TextView actionBarTitle = (TextView) findViewById(R.id.action_bar_title_exercise_theory);
        actionBarTitle.setText(getApplicationContext().getString(R.string.added_signed_numbers) + ", THEORY");

        String theoryString = "i: To add signed numbers (assuming that a and b are positive numbers):\n\n" +
                "ii: If the signs are the same: Add the absolute values of the two numbers together and let their common sign be the sign of the answer.\n" +
                "(+a) + (+b) = +(a + b) and (-a) + (-b) = -(a + b)\n\n" +
                "iii: If the signs are different: Find the difference between the absolute values of the two numbers (subtract the smaller absolute value from the larger) and let the answer have the sign of the number with the larger absolute value.\n" +
                "Assume that |a| > |b|.\n" +
                "(+a) + (+b) = +(a - b) and (-a) + (+b) = -(a - b)";
        TextView theory = (TextView) findViewById(R.id.theory);
        theory.setText(theoryString);

        String exampleString = "4 + (-3) = 1\n\n" +
                "5 + (-11) = -6\n\n" +
                "(-18) + (-5) = -23\n\n" +
                "47 + (-33) = 14";
        TextView example = (TextView) findViewById(R.id.example);
        example.setText(exampleString);

        buttonIntents();
    }

    private void buttonIntents() {
        findViewById(R.id.theory_back_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TheoryThree.this, TrainingModeBeginScreen.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.ok_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TheoryThree.this, LevelSelectionExerciseThree.class);
                startActivity(intent);
            }
        });
    }
}