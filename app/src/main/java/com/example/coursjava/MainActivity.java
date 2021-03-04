package com.example.coursjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button lancer;
    private Button anciens;
    private TextView depsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lancer = (Button) findViewById(R.id.buttonLancer);
        anciens = (Button) findViewById(R.id.buttonAnciens);
        depsi = (TextView) findViewById(R.id.depsi);

        //Activité pour changer de page et aller sur la page Depsi depuis la Main page.
        depsi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent depsiActivity = new Intent(MainActivity.this, DepsiActivity.class);
                startActivity(depsiActivity);
            }
        });

        //Activité pour changer de page et aller sur la page de lancer depuis la Main page.
        lancer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent lancerActivity = new Intent(MainActivity.this, LancerActivity.class);
                startActivity(lancerActivity);
            }
        });

        //Activité pour changer de page et aller sur la page d'historique depuis la Main page.
        anciens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent anciensActivity = new Intent(MainActivity.this, AnciensLancerActivity.class);
                startActivity(anciensActivity);
            }
        });
    }
}