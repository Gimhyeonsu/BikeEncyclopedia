package com.ex.bikeencyclopediaapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ex.bikeencyclopediaapplication.R;

public class Korea_7_Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7_korea);

        findViewById(R.id.samcheonri_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.samcheonri_button:
                Intent samcheonri_button = new Intent(Korea_7_Activity.this, Samcheonri_Biketype_8_Activity.class);
                startActivity(samcheonri_button);
                break;
        }
    }
}
