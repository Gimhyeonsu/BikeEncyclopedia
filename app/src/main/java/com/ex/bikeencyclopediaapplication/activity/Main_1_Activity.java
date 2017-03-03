package com.ex.bikeencyclopediaapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.support.v7.app.AppCompatActivity;

import com.ex.bikeencyclopediaapplication.R;

public class Main_1_Activity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_main);

        findViewById(R.id.bike_button).setOnClickListener(this);
        findViewById(R.id.wear_button).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {


        switch (view.getId()) {
            case R.id.bike_button:
                Intent bike = new Intent(this, Bike_1_1_Activity.class);
                startActivity(bike);
                break;

            case R.id.wear_button :
                Intent wear = new Intent(this, Wear_1_2_Activity.class);
                startActivity(wear);
                break;


        }
    }
}