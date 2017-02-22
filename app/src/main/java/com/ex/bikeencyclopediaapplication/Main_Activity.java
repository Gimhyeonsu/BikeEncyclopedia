package com.ex.bikeencyclopediaapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Main_Activity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.bike_button).setOnClickListener(this);

//        Button button = (Button) findViewById(R.id.bike_button);
//        button.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {

        Intent intent = new Intent(Main_Activity.this, Bike_Activity.class);
        startActivity(intent);

    }
}

