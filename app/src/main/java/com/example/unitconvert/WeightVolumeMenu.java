package com.example.unitconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WeightVolumeMenu extends AppCompatActivity {
    Button kilogramButton, poundButton, litreButton, gallonButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight_volume_menu);

        kilogramButton = findViewById(R.id.kilogramButton);
        poundButton = findViewById(R.id.poundButton);
        litreButton = findViewById(R.id.litreButton);
        gallonButton = findViewById(R.id.gallonButton);

        kilogramButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openKilogramMenu();
            }
        });
        poundButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPoundMenu();
            }
        });
        litreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLitreMenu();
            }
        });
    }

    public void openKilogramMenu() {
        Intent intent = new Intent(this, KilogramMenu.class);
        startActivity(intent);
    }

    public void openPoundMenu() {
        Intent intent = new Intent(this, PoundMenuAndConversion.class);
        startActivity(intent);
    }
    public void openLitreMenu() {
        Intent intent = new Intent(this, LitreMenuAndConversion.class);
        startActivity(intent);
    }
}