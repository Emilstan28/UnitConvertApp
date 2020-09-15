package com.example.unitconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CelsiusConversion extends AppCompatActivity {
    Button fahrenheitButton, kelvinButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celsius_conversion);

        fahrenheitButton = findViewById(R.id.fahrenheitButton);
        kelvinButton = findViewById(R.id.kelvinButton);

        fahrenheitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fahrenheitClicked();
            }
        });
    }

    public void fahrenheitClicked() {
        EditText numberToConvert = findViewById(R.id.numberToConvert);
        EditText answerHere = findViewById(R.id.answerField);

        if (numberToConvert.getText().toString().isEmpty() || numberToConvert.getText() == null) {
            answerHere.setText(R.string.invalidInput);
        } else {
            double originalNumber;
            double numbersToConvert = Double.parseDouble(numberToConvert.getText().toString());
            originalNumber = numbersToConvert;
            numbersToConvert = numbersToConvert / 5 * 9 + 32;
            String toDisplay = String.format("%s degrees C is equal to %s degrees F.", originalNumber, numbersToConvert);
            answerHere.setText(toDisplay);
        }
    }
}