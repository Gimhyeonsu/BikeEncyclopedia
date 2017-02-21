package com.ex.bikeencyclopediaapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private FrameLayout mFrameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFrameLayout = (FrameLayout) findViewById(R.id.main_fragment_framelayout);

        findViewById(R.id.bike_button).setOnClickListener(this);
        findViewById(R.id.w_button).setOnClickListener(this);
        findViewById(R.id.p_button).setOnClickListener(this);
        findViewById(R.id.e_button).setOnClickListener(this);
        findViewById(R.id.a_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.bike_button :
                Intent intent = new Intent(this, ListViewActivity.class);
                startActivity(intent);
                break;
//            case R.id.w_button
//            case R.id.p_button
//            case R.id.e_button
//            case R.id.a_button
        }
    }
}
