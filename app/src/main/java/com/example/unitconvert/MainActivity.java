package com.example.unitconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button temperatureButton, weightButton, distanceButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        temperatureButton = findViewById(R.id.temperatureButton);
        weightButton = findViewById(R.id.weightButton);
        distanceButton = findViewById(R.id.distanceButton);

        temperatureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTemperatureMenu();
            }
        });

        
    }

    public void openTemperatureMenu() {
        Intent intent = new Intent(this, TemperatureMenu.class);
        startActivity(intent);
    }
}