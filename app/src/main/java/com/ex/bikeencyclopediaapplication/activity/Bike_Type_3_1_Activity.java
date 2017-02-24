package com.ex.bikeencyclopediaapplication.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.ex.bikeencyclopediaapplication.R;
import com.ex.bikeencyclopediaapplication.adapters.Bike_Type_Adapter;
import com.ex.bikeencyclopediaapplication.model.Bike_Type_Model;

import java.util.ArrayList;
import java.util.List;

public class Bike_Type_3_1_Activity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView mBikeTypeListView;
    private List<Bike_Type_Model> mBikeTypeModel;
    private Bike_Type_Adapter mBikeTypeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3_1_bike_type);

        mBikeTypeListView = (ListView) findViewById(R.id.bike_type_list_view);

        mBikeTypeModel = new ArrayList<>();
        mBikeTypeModel.add(new Bike_Type_Model(R.drawable.road_bike));
        mBikeTypeModel.add(new Bike_Type_Model(R.drawable.mountain_bike));
        mBikeTypeModel.add(new Bike_Type_Model(R.drawable.fitness_bike));
        mBikeTypeModel.add(new Bike_Type_Model(R.drawable.turbo_bike));
        mBikeTypeModel.add(new Bike_Type_Model(R.drawable.kids_bike));

        mBikeTypeAdapter = new Bike_Type_Adapter(this, mBikeTypeModel);

        mBikeTypeListView.setAdapter(mBikeTypeAdapter);

        mBikeTypeListView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position) {
            case 0:
                Intent roadBikeMenu = new Intent(Bike_Type_3_1_Activity.this, Road_Bike_Menu_4_Activity.class);
                startActivity(roadBikeMenu);
                break;
        }
    }
}
