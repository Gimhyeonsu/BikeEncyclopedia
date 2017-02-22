package com.ex.bikeencyclopediaapplication.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.ex.bikeencyclopediaapplication.R;
import com.ex.bikeencyclopediaapplication.model.Bike_Type_Model;

import java.util.List;

/**
 * Created by K on 2017-02-22.
 */

public class Bike_Type_Adapters extends BaseAdapter {

    private final List<Bike_Type_Model> mData;
    private Context mContext;

    public Bike_Type_Adapters(List<Bike_Type_Model> mData, Context mContext) {
        this.mData = mData;
        this.mContext = mContext;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        ViewHolder viewHolder;

        if (convertView == null) {
            viewHolder = new ViewHolder();

            convertView = LayoutInflater.from(mContext)
                    .inflate(R.layout.item_bike_type, parent, false);

            /*ImageButton imageButton = (ImageButton) convertView.findViewById(R.id.item_bike_type_image_button);*/
            ImageView imageButton = (ImageView) convertView.findViewById(R.id.item_bike_type_image_button);

            viewHolder.bikeTypeImageButton = imageButton;

            convertView.setTag(viewHolder);

        } else {

            viewHolder = (ViewHolder) convertView.getTag();

        }

        Bike_Type_Model bike_type_model = mData.get(position);

        viewHolder.bikeTypeImageButton.setImageResource(bike_type_model.getImageButtonRes());

        return convertView;
    }

    static class ViewHolder {
        /*ImageButton*/ImageView bikeTypeImageButton;
    }

}
