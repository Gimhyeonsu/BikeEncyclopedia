package com.ex.bikeencyclopediaapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ex.bikeencyclopediaapplication.R;

public class Samcheonri_Biketype_8_Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_8_samcheonri_biketype);

        findViewById(R.id.samcheonri_road_button).setOnClickListener(this);
        findViewById(R.id.samcheonri_mtb_button).setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.samcheonri_road_button:
                Intent samcheonri_road_button = new Intent(Samcheonri_Biketype_8_Activity.this,
                        Samcheonri_Road_9_1_Activity.class);
                startActivity(samcheonri_road_button);
                break;

            case R.id.samcheonri_mtb_button :
                Intent samcheonri_mtb_button = new Intent(Samcheonri_Biketype_8_Activity.this,
                        Samcheonri_Mtb_9_2_Activity.class);
                startActivity(samcheonri_mtb_button);
                break;


        }
    }
}
