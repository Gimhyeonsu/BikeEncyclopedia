package com.ex.bikeencyclopediaapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ex.bikeencyclopediaapplication.R;

public class Continent_1_1_2_Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1_1_2_continent);

        findViewById(R.id.asia_button).setOnClickListener(this);
        findViewById(R.id.europe_button).setOnClickListener(this);
        findViewById(R.id.north_america_button).setOnClickListener(this);
        findViewById(R.id.sorth_america_button).setOnClickListener(this);
        findViewById(R.id.oceania_button).setOnClickListener(this);
        findViewById(R.id.africa_button).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.asia_button:
                Intent asia_button = new Intent(Continent_1_1_2_Activity.this,
                        Country_Menu_3_1_Activity.class);
                startActivity(asia_button);
                break;

            case R.id.europe_button:
                Intent europe_button = new Intent(Continent_1_1_2_Activity.this,
                        Country_Menu_3_1_Activity.class);
                startActivity(europe_button);
                break;

            case R.id.north_america_button:
                Intent north_america_button = new Intent(Continent_1_1_2_Activity.this,
                        Country_Menu_3_1_Activity.class);
                startActivity(north_america_button);
                break;

            case R.id.sorth_america_button:
                Intent sorth_america_button = new Intent(Continent_1_1_2_Activity.this,
                        Country_Menu_3_1_Activity.class);
                startActivity(sorth_america_button);
                break;

            case R.id.oceania_button:
                Intent oceania_button = new Intent(Continent_1_1_2_Activity.this,
                        Country_Menu_3_1_Activity.class);
                startActivity(oceania_button);
                break;
            case R.id.africa_button:
                Intent africa_button = new Intent(Continent_1_1_2_Activity.this,
                        Country_Menu_3_1_Activity.class);
                startActivity(africa_button);
                break;
        }
    }
}
