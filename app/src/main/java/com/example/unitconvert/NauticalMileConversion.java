package com.example.unitconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NauticalMileConversion extends AppCompatActivity {
    Button nauticalMileToKilometreConvButton, nauticalMileToMileConvButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nautical_mile_conversion);

        nauticalMileToKilometreConvButton = findViewById(R.id.nauticalMileToKilometreConvButton);
        nauticalMileToMileConvButton = findViewById(R.id.nauticalMileToMileConvButton);

        nauticalMileToKilometreConvButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nauticalMileToKilometreConvertClicked();
            }
        });

        nauticalMileToMileConvButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nauticalMileToMileConvertClicked();
            }
        });
    }

    public void nauticalMileToKilometreConvertClicked() {
        EditText numberToConvert = findViewById(R.id.numberToConvert);
        EditText answerHere = findViewById(R.id.answerField);

        if (numberToConvert.getText().toString().isEmpty() || numberToConvert.getText() == null) {
            answerHere.setText(R.string.invalidInput);
        } else {
            double originalNumber;
            double numbersToConvert = Double.parseDouble(numberToConvert.getText().toString());
            originalNumber = numbersToConvert;
            numbersToConvert = numbersToConvert * 1.852;
            String twoDecimalDigits = String.format("%.2f", numbersToConvert);
            String toDisplay = String.format("%s nautical miles is equal to %s kilometres.", originalNumber, twoDecimalDigits);
            answerHere.setText(toDisplay);
        }
    }

    public void nauticalMileToMileConvertClicked() {
        EditText numberToConvert = findViewById(R.id.numberToConvert);
        EditText answerHere = findViewById(R.id.answerField);

        if (numberToConvert.getText().toString().isEmpty() || numberToConvert.getText() == null) {
            answerHere.setText(R.string.invalidInput);
        } else {
            double originalNumber;
            double numbersToConvert = Double.parseDouble(numberToConvert.getText().toString());
            originalNumber = numbersToConvert;
            numbersToConvert = numbersToConvert * 1.15;
            String twoDecimalDigits = String.format("%.2f", numbersToConvert);
            String toDisplay = String.format("%s nautical miles is equal to %s miles.", originalNumber, twoDecimalDigits);
            answerHere.setText(toDisplay);
        }
    }
}