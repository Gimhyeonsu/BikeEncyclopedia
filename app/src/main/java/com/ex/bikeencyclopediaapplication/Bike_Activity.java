package com.ex.bikeencyclopediaapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.ex.bikeencyclopediaapplication.adapters.Bike_Type_Adapters;
import com.ex.bikeencyclopediaapplication.model.Bike_Type_Model;

import java.util.ArrayList;
import java.util.List;

public class Bike_Activity extends AppCompatActivity {

    private ListView mBikeTypeListView;
    private List<Bike_Type_Model> mBikeTypeModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout./*activity_bike*/activity_bike_type);



//        findViewById(R.id.bike_type_button).setOnClickListener(this);
//        findViewById(R.id.brand_button).setOnClickListener(this);


        mBikeTypeListView = (ListView) findViewById(R.id.bike_type_list_view);

        mBikeTypeModel = new ArrayList<>();
        mBikeTypeModel.add(new Bike_Type_Model(R.drawable.road_bike));
        mBikeTypeModel.add(new Bike_Type_Model(R.drawable.mountain_bike));
        mBikeTypeModel.add(new Bike_Type_Model(R.drawable.fitness_bike));
        mBikeTypeModel.add(new Bike_Type_Model(R.drawable.turbo_bike));
        mBikeTypeModel.add(new Bike_Type_Model(R.drawable.kids_bike));

        Bike_Type_Adapters bike_type_adapters = new Bike_Type_Adapters(mBikeTypeModel, this);
        mBikeTypeListView.setAdapter(bike_type_adapters);
    }

//    @Override
//    public void onClick(View view) {
//
//        Intent bikeType = new Intent(Bike_Activity.this, Bike_Type_Activity.class);
//        Intent brand = new Intent(Bike_Activity.this, Brand_Activity.class);
//        switch (view.getId()) {
//            case R.id.bike_type_button:
//                Toast.makeText(this, "타입", Toast.LENGTH_SHORT).show();
//                startActivity(bikeType);
//                break;
//            case R.id.brand_button:
//                Toast.makeText(this, "브랜드", Toast.LENGTH_SHORT).show();
//                startActivity(brand);
//                break;
//        }

}
