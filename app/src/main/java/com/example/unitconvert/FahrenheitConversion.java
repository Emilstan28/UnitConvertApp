package com.example.unitconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class FahrenheitConversion extends AppCompatActivity {

    Button FahrenheitToCelsiusConvertButton, FahrenheitToKelvinConvertButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fahrenheit_conversion);
        FahrenheitToCelsiusConvertButton = findViewById(R.id.fahrenheitToCelsiusConvertButton);
        FahrenheitToKelvinConvertButton = findViewById(R.id.fahrenheitToKelvinConvertButton);

        FahrenheitToCelsiusConvertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fahrToCelsConversion();
            }
        });

        FahrenheitToKelvinConvertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fahrToKelConversion();
            }
        });
    }


    public void fahrToCelsConversion() {
        EditText numberToConvert = findViewById(R.id.numberToConvertFahrDegree);
        EditText answerHere = findViewById(R.id.answerFieldFahrDegree);

        if (numberToConvert.getText().toString().isEmpty() || numberToConvert.getText() == null) {
            answerHere.setText(R.string.invalidInput);
        } else {
            double originalNumber;
            double numbersToConvert = Double.parseDouble(numberToConvert.getText().toString());
            originalNumber = numbersToConvert;
            numbersToConvert = (numbersToConvert-32) * 5 / 9;
            String twoDecimalDigits = String.format("%.2f", numbersToConvert);
            String toDisplay = String.format("%s degrees F is equal to %s degrees C.", originalNumber, twoDecimalDigits);
            answerHere.setText(toDisplay);
        }
    }

    public void fahrToKelConversion() {
        EditText numberToConvert = findViewById(R.id.numberToConvertFahrDegree);
        EditText answerHere = findViewById(R.id.answerFieldFahrDegree);

        if (numberToConvert.getText().toString().isEmpty() || numberToConvert.getText() == null) {
            answerHere.setText(R.string.invalidInput);
        } else {
            double originalNumber;
            double numbersToConvert = Double.parseDouble(numberToConvert.getText().toString());
            originalNumber = numbersToConvert;
            numbersToConvert = (numbersToConvert-32) * 5 / 9 + 273.15;
            String twoDecimalDigits = String.format("%.2f", numbersToConvert);
            String toDisplay = String.format("%s degrees F is equal to %s degrees K.", originalNumber, twoDecimalDigits);
            answerHere.setText(toDisplay);
        }
    }
}