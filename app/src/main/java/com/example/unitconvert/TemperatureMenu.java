package com.example.unitconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TemperatureMenu extends AppCompatActivity {
    Button celsiusButton, fahrenheitButton, kelvinButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature_menu);

        celsiusButton = findViewById(R.id.celsiusButton);
        fahrenheitButton = findViewById(R.id.fahrenheitButton);
        kelvinButton = findViewById(R.id.kelvinButton);

        celsiusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toCelsiusView();
            }
        });
    }

    public void toCelsiusView() {
        Intent intent = new Intent(this, CelsiusConversion.class);
        startActivity(intent);
    }
}