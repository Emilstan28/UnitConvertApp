package com.example.unitconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class KilogramMenu extends AppCompatActivity {
    Button convertButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kilogram_menu);

        convertButton = findViewById(R.id.kilogramToPoundsConvertButton);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convertKilosToPounds();
            }
        });
    }

    public void convertKilosToPounds() {
        EditText numberToConvert = findViewById(R.id.numberToConvert);
        EditText answerHere = findViewById(R.id.answerField);

        if (numberToConvert.getText().toString().isEmpty() || numberToConvert.getText() == null) {
            answerHere.setText(R.string.invalidInput);
        } else {
            double originalNumber;
            double numbersToConvert = Double.parseDouble(numberToConvert.getText().toString());
            originalNumber = numbersToConvert;
            numbersToConvert = numbersToConvert / 0.45359237;
            String twoDecimalDigits = String.format("%.2f", numbersToConvert);
            String toDisplay = String.format("%s kilograms is equal to %s pounds.", originalNumber, twoDecimalDigits);
            answerHere.setText(toDisplay);
        }
    }
}