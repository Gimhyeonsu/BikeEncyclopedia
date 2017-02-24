package com.ex.bikeencyclopediaapplication.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ex.bikeencyclopediaapplication.R;

public class Country_Menu_6_Activity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6_country_menu);

        findViewById(R.id.taegeukgi_Button).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.taegeukgi_Button :
                Intent taegeukgi_Button = new Intent(Country_Menu_6_Activity.this, Korea_7_Activity.class);
                startActivity(taegeukgi_Button);
        }

    }
}
