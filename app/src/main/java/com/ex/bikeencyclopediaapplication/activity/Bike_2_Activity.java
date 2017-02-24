package com.ex.bikeencyclopediaapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ex.bikeencyclopediaapplication.R;

public class Bike_2_Activity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2_bike);

        findViewById(R.id.bike_type_button).setOnClickListener(this);
        findViewById(R.id.bike_brand_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.bike_type_button:
                Intent bike_type_button = new Intent(this, Bike_Type_3_1_Activity.class);
                startActivity(bike_type_button);
                break;

            case R.id.bike_brand_button:
                Intent bike_brand_button = new Intent(this, Bike_Brand_3_2Activity.class);
                startActivity(bike_brand_button);
                break;
        }
    }
}