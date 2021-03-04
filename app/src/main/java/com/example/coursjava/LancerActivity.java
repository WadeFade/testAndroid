package com.example.coursjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Random;

public class LancerActivity extends AppCompatActivity {

    private int randomNumber;
    private Button rollDice;
    private TextView showResult;
    private Switch numberOrImage;
    private boolean isNotText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lancer);

        rollDice = (Button) findViewById(R.id.rollDice);
        showResult = (TextView) findViewById(R.id.showResult);
        numberOrImage = (Switch) findViewById(R.id.switch1);

        numberOrImage.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                isNotText = isChecked;
                if (isChecked) {
                    showResult.setVisibility(View.INVISIBLE);
                } else {
                    showResult.setVisibility(View.VISIBLE);
                }
            }
        });

        rollDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rand = new Random();
                randomNumber = rand.nextInt(6 - 1 + 1) + 1;

                if (isNotText) {
                    showResult.setVisibility(View.INVISIBLE);
//                    TODO switch case avec les images allant de 1 à 6

                } else {
                    showResult.setText(String.valueOf(randomNumber));
                    showResult.setVisibility(View.VISIBLE);
                }
            }
        });
    }
}