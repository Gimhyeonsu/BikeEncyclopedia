package com.ex.bikeencyclopediaapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ex.bikeencyclopediaapplication.R;

public class Road_Bike_Menu_4_Activity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4_road_bike_menu);

        findViewById(R.id.country_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.country_button:
                Intent country_button = new Intent(this, Continent_5_Activity.class);
                startActivity(country_button);
                break;
        }
    }
}
