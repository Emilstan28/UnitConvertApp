package com.example.unitconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button temperatureButton, weightVolumeButton, distanceButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        temperatureButton = findViewById(R.id.temperatureButton);
        weightVolumeButton = findViewById(R.id.weightVolumeButton);
        distanceButton = findViewById(R.id.distanceButton);

        temperatureButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTemperatureMenu();
            }
        });

        weightVolumeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openWeightVolumeMenu();
            }
        });
    }

    public void openTemperatureMenu() {
        Intent intent = new Intent(this, TemperatureMenu.class);
        startActivity(intent);
    }

    public void openWeightVolumeMenu() {
        Intent intent = new Intent(this, WeightVolumeMenu.class);
        startActivity(intent);
    }
}