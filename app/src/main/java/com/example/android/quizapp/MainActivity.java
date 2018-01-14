package com.example.android.quizapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    int score = 0;
    CheckBox ONE,TWO,THREE,FOUR,FIVE;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Assign and initialize checkboxes
        ONE = (CheckBox)findViewById(R.id.checkBoxOgbunike);
        TWO = (CheckBox)findViewById(R.id.checkBoxIkogosi);
        THREE = (CheckBox)findViewById(R.id.checkBoxGurara);
        FOUR = (CheckBox)findViewById(R.id.checkBoxNgwo);
        FIVE = (CheckBox)findViewById(R.id.checkBoxOlumo);

        // Initialize EditText
        editText = (EditText) findViewById(R.id.input_kaduna);

        // Get the id of the button that submits the quiz
        Button submitButton = (Button) findViewById(R.id.submit_button);

        // Set a click listener on the button

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Access the RadioGroup view and save it to a variable.
                RadioGroup radioGroup = (RadioGroup) findViewById(R.id.yankari_radio_group);

                //Get the id of the RadioButton that is checked and save it
                //as an integer variable.
                int solutionId = radioGroup.getCheckedRadioButtonId();

                //Use if statements to respond based on whether
                //it is the id of the correct answer.
                if (solutionId == R.id.radio_bauchi) {
                    score += 10;
                } else {
                    score += 0;
                }
                //Access the RadioGroup2 view and save it to a variable.
                RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.ikogosi_radio_group);

                //Get the id of the RadioButton that is checked and save it
                //as an integer variable.
                int solutionId2 = radioGroup2.getCheckedRadioButtonId();

                //Use if statements to respond based on whether
                //it is the id of the correct answer.
                if (solutionId2 == R.id.radio_ikogosi) {
                    score += 10;
                } else {
                    score += 0;
                }

                //Access the RadioGroup3 view and save it to a variable.
                RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.volcanoes);

                //Get the id of the RadioButton that is checked and save it
                //as an integer variable.
                int solutionId3 = radioGroup3.getCheckedRadioButtonId();

                //Use if statements to respond based on whether
                //it is the id of the correct answer.
                if (solutionId3 == R.id.radio_false) {
                    score += 10;
                } else {
                    score += 0;
                }

                //Access the RadioGroup4 view and save it to a variable.
                RadioGroup radioGroup4 = (RadioGroup) findViewById(R.id.kajuri_radio_group);

                //Get the id of the RadioButton that is checked and save it
                //as an integer variable.
                int solutionId4 = radioGroup4.getCheckedRadioButtonId();

                //Use if statements to respond based on whether
                //it is the id of the correct answer.
                if (solutionId4 == R.id.radio_kajuri_castle) {
                    score += 10;
                } else {
                    score += 0;
                }

                //Checks correct answers for the checkboxes
                if(ONE.isChecked())
                {
                    score += 10;
                }  else{
                    score += 0;
                }
                if(TWO.isChecked())
                {
                    score += 10;
                }  else{
                    score += 0;
                }
                if(THREE.isChecked())
                {
                    score += 10;
                }  else{
                    score += 0;
                }
                if(FOUR.isChecked())
                {
                    score += 10;
                }  else{
                    score += 0;
                }
                if(FIVE.isChecked())
                {
                    score += 10;
                }  else{
                    score += 0;
                }

                //Use if statements to respond based on whether
                //it is the correct answer.
                String correctAnswer = editText.getText().toString();
                if (correctAnswer.equals("Kaduna")) {
                    score += 10;
                }  else{
                    score +=0;
                }

                Context context = getApplicationContext();
                CharSequence text = " Your score is: " + score + " percent";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }

        });

        // Get the id of the button that clear the result of the quiz
        Button clearButton = (Button) findViewById(R.id.clear_button);

        // Set a click listener on the button

        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score = 0;

                // clear the selected radio button in the radio group
                RadioGroup radioGroup = (RadioGroup) findViewById(R.id.yankari_radio_group);
                radioGroup.clearCheck();

                // clear the selected radio button in the radio group
                RadioGroup radioGroup2 = (RadioGroup) findViewById(R.id.ikogosi_radio_group);
                radioGroup2.clearCheck();

                // clear the selected radio button in the radio group
                RadioGroup radioGroup3 = (RadioGroup) findViewById(R.id.volcanoes);
                radioGroup3.clearCheck();

                // clear the selected radio button in the radio group
                RadioGroup radioGroup4 = (RadioGroup) findViewById(R.id.kajuri_radio_group);
                radioGroup4.clearCheck();

                // clear the selected checkboxes
                if (ONE.isChecked()) {
                    ONE.setChecked(false);
                }
                if (TWO.isChecked()) {
                    TWO.setChecked(false);
                }
                if (THREE.isChecked()) {
                    THREE.setChecked(false);
                }
                if (FOUR.isChecked()) {
                    FOUR.setChecked(false);
                }
                if (FIVE.isChecked()) {
                    FIVE.setChecked(false);
                }

                // clear the name in the edit text field
                ((EditText) findViewById(R.id.input_kaduna)).setText("");
                Context context = getApplicationContext();
                CharSequence text = "Try again?";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }


        });

    }
}