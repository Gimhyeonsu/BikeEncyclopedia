package com.ex.bikeencyclopediaapplication.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.ex.bikeencyclopediaapplication.R;

public class Bike_Brand_3_2Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3_2_bike_brand);

        findViewById(R.id.specialized_button).setOnClickListener(this);
        findViewById(R.id.sam_cheon_ri_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent specialized = new Intent(Bike_Brand_3_2Activity.this, Specialized_Activity.class);

        switch (view.getId()) {
            case R.id.specialized_button:
                Toast.makeText(this, "스페셜라이즈드", Toast.LENGTH_SHORT).show();
                startActivity(specialized);
                break;
        }
    }
}
