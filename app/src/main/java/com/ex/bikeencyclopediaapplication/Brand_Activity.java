package com.ex.bikeencyclopediaapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Brand_Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bike_brand);

        findViewById(R.id.specialized_button).setOnClickListener(this);
        findViewById(R.id.sam_cheon_ri_button).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent specialized = new Intent(Brand_Activity.this, Specialized_Activity.class);
        Intent samcheonri = new Intent(Brand_Activity.this, SamCheonRi_Activity.class);

        switch (view.getId()) {
            case R.id.specialized_button :
                Toast.makeText(this, "스페셜라이즈드", Toast.LENGTH_SHORT).show();
                startActivity(specialized);
                break;
            case R.id.sam_cheon_ri_button :
                Toast.makeText(this, "삼천리", Toast.LENGTH_SHORT).show();
                startActivity(samcheonri);
                break;

        }

    }
}
