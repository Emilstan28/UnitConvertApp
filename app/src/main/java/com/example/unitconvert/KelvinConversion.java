package com.example.unitconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KelvinConversion extends AppCompatActivity {
    Button kelvinToCelsius, kelvinToFahrenheit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelvin_conversion);

        kelvinToCelsius = findViewById(R.id.kelvinToCelConvButton);
        kelvinToFahrenheit = findViewById(R.id.kelvinToFahrenheitConvButton);

        kelvinToCelsius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kelvinToCelsiusConvertClicked();
            }
        });

        kelvinToFahrenheit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                kelvinToFahrenheitConvertClicked();
            }
        });
    }

    public void kelvinToCelsiusConvertClicked() {
        EditText numberToConvert = findViewById(R.id.numberToConvert);
        EditText answerHere = findViewById(R.id.answerField);

        if (numberToConvert.getText().toString().isEmpty() || numberToConvert.getText() == null) {
            answerHere.setText(R.string.invalidInput);
        } else {
            double originalNumber;
            double numbersToConvert = Double.parseDouble(numberToConvert.getText().toString());
            originalNumber = numbersToConvert;
            numbersToConvert = numbersToConvert - 273.15;
            String twoDecimalDigits = String.format("%.2f", numbersToConvert);
            String toDisplay = String.format("%s degrees K is equal to %s degrees C.", originalNumber, twoDecimalDigits);
            answerHere.setText(toDisplay);
        }
    }

    public void kelvinToFahrenheitConvertClicked() {
        EditText numberToConvert = findViewById(R.id.numberToConvert);
        EditText answerHere = findViewById(R.id.answerField);

        if (numberToConvert.getText().toString().isEmpty() || numberToConvert.getText() == null) {
            answerHere.setText(R.string.invalidInput);
        } else {
            double originalNumber;
            double numbersToConvert = Double.parseDouble(numberToConvert.getText().toString());
            originalNumber = numbersToConvert;
            numbersToConvert = (numbersToConvert + 459.67) * 5 / 9;
            String twoDecimalDigits = String.format("%.2f", numbersToConvert);
            String toDisplay = String.format("%s degrees K is equal to %s degrees F.", originalNumber, twoDecimalDigits);
            answerHere.setText(toDisplay);
        }
    }
}