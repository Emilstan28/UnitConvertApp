package com.example.unitconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LitreMenuAndConversion extends AppCompatActivity {
    Button convertButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_litre_menu_and_conversion);

        convertButton = findViewById(R.id.litresToGallonsConversionButton);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convertLitresToGallons();
            }
        });
    }

    public void convertLitresToGallons() {
        EditText numberToConvert = findViewById(R.id.numberToConvert);
        EditText answerHere = findViewById(R.id.answerField);

        if (numberToConvert.getText().toString().isEmpty() || numberToConvert.getText() == null) {
            answerHere.setText(R.string.invalidInput);
        } else {
            double originalNumber;
            double numbersToConvert = Double.parseDouble(numberToConvert.getText().toString());
            originalNumber = numbersToConvert;
            numbersToConvert = numbersToConvert / 3.785;
            String twoDecimalDigits = String.format("%.2f", numbersToConvert);
            String toDisplay = String.format("%s litres is equal to %s gallons.", originalNumber, twoDecimalDigits);
            answerHere.setText(toDisplay);
        }
    }
}