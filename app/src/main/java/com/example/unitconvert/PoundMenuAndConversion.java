package com.example.unitconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PoundMenuAndConversion extends AppCompatActivity {
    Button convertButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pound_menu_and_conversion);

        convertButton = findViewById(R.id.poundToKilogramsConvertButton);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convertPoundsToKilos();
            }
        });
    }

    public void convertPoundsToKilos() {
        EditText numberToConvert = findViewById(R.id.numberToConvert);
        EditText answerHere = findViewById(R.id.answerField);

        if (numberToConvert.getText().toString().isEmpty() || numberToConvert.getText() == null) {
            answerHere.setText(R.string.invalidInput);
        } else {
            double originalNumber;
            double numbersToConvert = Double.parseDouble(numberToConvert.getText().toString());
            originalNumber = numbersToConvert;
            numbersToConvert = numbersToConvert / 2.205;
            String twoDecimalDigits = String.format("%.2f", numbersToConvert);
            String toDisplay = String.format("%s pounds is equal to %s kilograms.", originalNumber, twoDecimalDigits);
            answerHere.setText(toDisplay);
        }
    }
}