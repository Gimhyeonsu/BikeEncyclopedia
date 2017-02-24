package com.ex.bikeencyclopediaapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ex.bikeencyclopediaapplication.R;

public class Continent_5_Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5_continent);

        findViewById(R.id.asia_button).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.asia_button :
                Intent asia_button = new Intent(Continent_5_Activity.this, Country_Menu_6_Activity.class);
                startActivity(asia_button);
                break;
        }

    }
}
