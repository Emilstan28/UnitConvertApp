package com.example.unitconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KilometerConversion extends AppCompatActivity {
    Button kilometreToMileConvButton, kilometreToNauticalMileConvButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kilometer_conversion);

        kilometreToMileConvButton = findViewById(R.id.kilometreToMileConvButton);
        kilometreToNauticalMileConvButton = findViewById(R.id.kilometreToNauticalMileConvButton);

        kilometreToMileConvButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kilometreToMileConvertClicked();
            }
        });

        kilometreToNauticalMileConvButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kilometreToNauticalMileConvertClicked();
            }
        });
    }

    public void kilometreToMileConvertClicked() {
        EditText numberToConvert = findViewById(R.id.numberToConvert);
        EditText answerHere = findViewById(R.id.answerField);

        if (numberToConvert.getText().toString().isEmpty() || numberToConvert.getText() == null) {
            answerHere.setText(R.string.invalidInput);
        } else {
            double originalNumber;
            double numbersToConvert = Double.parseDouble(numberToConvert.getText().toString());
            originalNumber = numbersToConvert;
            numbersToConvert = numbersToConvert / 1.609344;
            String twoDecimalDigits = String.format("%.2f", numbersToConvert);
            String toDisplay = String.format("%s kilometres is equal to %s miles.", originalNumber, twoDecimalDigits);
            answerHere.setText(toDisplay);
        }
    }

    public void kilometreToNauticalMileConvertClicked() {
        EditText numberToConvert = findViewById(R.id.numberToConvert);
        EditText answerHere = findViewById(R.id.answerField);

        if (numberToConvert.getText().toString().isEmpty() || numberToConvert.getText() == null) {
            answerHere.setText(R.string.invalidInput);
        } else {
            double originalNumber;
            double numbersToConvert = Double.parseDouble(numberToConvert.getText().toString());
            originalNumber = numbersToConvert;
            numbersToConvert = numbersToConvert / 1.852;
            String twoDecimalDigits = String.format("%.2f", numbersToConvert);
            String toDisplay = String.format("%s kilometres is equal to %s nautical miles.", originalNumber, twoDecimalDigits);
            answerHere.setText(toDisplay);
        }
    }
}