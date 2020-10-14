package com.example.unitconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button temperatureButton = findViewById(R.id.temperatureButton);
        Button weightVolumeButton = findViewById(R.id.weightVolumeButton);
        Button distanceButton = findViewById(R.id.distanceButton);

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

        distanceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDistanceMenu();
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

    public void openDistanceMenu() {
        Intent intent = new Intent(this, DistanceMenu.class);
        startActivity(intent);
    }
}