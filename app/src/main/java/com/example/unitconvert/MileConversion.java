package com.example.unitconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MileConversion extends AppCompatActivity {
    Button mileToKilometreConvButton, mileToNauticalMileConvButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mile_conversion);

        mileToKilometreConvButton = findViewById(R.id.mileToKilometreConvButton);
        mileToNauticalMileConvButton = findViewById(R.id.mileToNauticalMileConvButton);

        mileToKilometreConvButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mileToKilometreConvertClicked();
            }
        });

        mileToNauticalMileConvButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mileToNauticalMileConvertClicked();
            }
        });
    }

    public void mileToKilometreConvertClicked() {
        EditText numberToConvert = findViewById(R.id.numberToConvert);
        EditText answerHere = findViewById(R.id.answerField);

        if (numberToConvert.getText().toString().isEmpty() || numberToConvert.getText() == null) {
            answerHere.setText(R.string.invalidInput);
        } else {
            double originalNumber;
            double numbersToConvert = Double.parseDouble(numberToConvert.getText().toString());
            originalNumber = numbersToConvert;
            numbersToConvert = numbersToConvert * 1.609344;
            String twoDecimalDigits = String.format("%.2f", numbersToConvert);
            String toDisplay = String.format("%s miles is equal to %s kilometres.", originalNumber, twoDecimalDigits);
            answerHere.setText(toDisplay);
        }
    }

    public void mileToNauticalMileConvertClicked() {
        EditText numberToConvert = findViewById(R.id.numberToConvert);
        EditText answerHere = findViewById(R.id.answerField);

        if (numberToConvert.getText().toString().isEmpty() || numberToConvert.getText() == null) {
            answerHere.setText(R.string.invalidInput);
        } else {
            double originalNumber;
            double numbersToConvert = Double.parseDouble(numberToConvert.getText().toString());
            originalNumber = numbersToConvert;
            numbersToConvert = numbersToConvert / 1.15;
            String twoDecimalDigits = String.format("%.2f", numbersToConvert);
            String toDisplay = String.format("%s miles is equal to %s nautical miles.", originalNumber, twoDecimalDigits);
            answerHere.setText(toDisplay);
        }
    }
}