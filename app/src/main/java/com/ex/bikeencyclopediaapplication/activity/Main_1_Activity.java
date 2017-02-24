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
    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent(this, Bike_2_Activity.class);
        startActivity(intent);
    }
}