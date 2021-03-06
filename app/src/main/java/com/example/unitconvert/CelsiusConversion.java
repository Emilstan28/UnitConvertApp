package com.example.unitconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CelsiusConversion extends AppCompatActivity {
    Button celsiusToFahrConvertButton, celsiusToKelvinConvertButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celsius_conversion);

        celsiusToFahrConvertButton = findViewById(R.id.celsiusToFahrConvButton);
        celsiusToKelvinConvertButton = findViewById(R.id.celsiusToKelvinConvButton);

        celsiusToFahrConvertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                celsiusToFahrConvertClicked();
            }
        });

        celsiusToKelvinConvertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                celsiusToKelvinConvertClicked();
            }
        });
    }

    public void celsiusToFahrConvertClicked() {
        EditText numberToConvert = findViewById(R.id.numberToConvert);
        EditText answerHere = findViewById(R.id.answerField);

        if (numberToConvert.getText().toString().isEmpty() || numberToConvert.getText() == null) {
            answerHere.setText(R.string.invalidInput);
        } else {
            double originalNumber;
            double numbersToConvert = Double.parseDouble(numberToConvert.getText().toString());
            originalNumber = numbersToConvert;
            numbersToConvert = numbersToConvert / 5 * 9 + 32;
            String twoDecimalDigits = String.format("%.2f", numbersToConvert);
            String toDisplay = String.format("%s degrees C is equal to %s degrees F.", originalNumber, twoDecimalDigits);
            answerHere.setText(toDisplay);
        }
    }

    public void celsiusToKelvinConvertClicked() {
        EditText numberToConvert = findViewById(R.id.numberToConvert);
        EditText answerHere = findViewById(R.id.answerField);

        if (numberToConvert.getText().toString().isEmpty() || numberToConvert.getText() == null) {
            answerHere.setText(R.string.invalidInput);
        } else {
            double originalNumber;
            double numbersToConvert = Double.parseDouble(numberToConvert.getText().toString());
            originalNumber = numbersToConvert;
            numbersToConvert = numbersToConvert + 273.15;
            String twoDecimalDigits = String.format("%.2f", numbersToConvert);
            String toDisplay = String.format("%s degrees C is equal to %s degrees K.", originalNumber, twoDecimalDigits);
            answerHere.setText(toDisplay);
        }
    }
}