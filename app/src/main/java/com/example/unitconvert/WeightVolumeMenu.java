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
    }

    public void openKilogramMenu() {
        Intent intent = new Intent(this, KilogramMenu.class);
        startActivity(intent);
    }
}