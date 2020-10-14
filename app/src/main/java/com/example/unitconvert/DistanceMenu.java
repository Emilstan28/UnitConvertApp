package com.example.unitconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DistanceMenu extends AppCompatActivity {
    Button kilometreButton, mileButton, nauticalMileButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distance_menu);

        kilometreButton = findViewById(R.id.kilometreButton);
        mileButton = findViewById(R.id.mileButton);
        nauticalMileButton = findViewById(R.id.nauticalMileButton);

        kilometreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toKilometreView();
            }
        });

        mileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toMileView();
            }
        });

        nauticalMileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toNauticalMileView();
            }
        });
    }

    public void toKilometreView() {
        Intent intent = new Intent(this, KilometerConversion.class);
        startActivity(intent);
    }

    public void toMileView() {
        Intent intent = new Intent(this, MileConversion.class);
        startActivity(intent);
    }

    public void toNauticalMileView() {
        Intent intent = new Intent(this, KelvinConversion.class);
        startActivity(intent);
    }
}