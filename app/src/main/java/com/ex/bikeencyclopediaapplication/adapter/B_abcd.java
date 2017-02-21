package com.ex.bikeencyclopediaapplication.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ex.bikeencyclopediaapplication.R;
import com.ex.bikeencyclopediaapplication.model.B_type;

import java.util.List;

import static android.content.ContentValues.TAG;

/**
 * Created by K on 2017-02-21.
 */

public class B_abcd extends BaseAdapter {

    private Context mContext;
    private List<B_type> mData;

    public B_abcd(Context Context, List<B_type> Data) {
        mContext = Context;
        mData = Data;
    }

    // 아이템 갯수
    @Override
    public int getCount() {
        return mData.size();
    }

    // 아이템 번째
    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    // 아이템 id
    @Override
    public long getItemId(int position) {
        return position;
    }

    // 아이템의 레이아웃
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        if (convertView == null) {
            viewHolder = new ViewHolder();

            // convertView : 재사용 되는 뷰
            convertView = LayoutInflater.from(mContext)
                    .inflate(R.layout.item_bike, parent, false);
            // 레이아웃에 들고 오기
            TextView textView = (TextView) convertView.findViewById(R.id.bike_text);

            // 뷰 홀더에 넣는다.
            viewHolder.bikeText = textView;

            convertView.setTag(viewHolder);
        } else {
            // 재사용 할 때
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Log.d(TAG, "getView: " + position);

        // 데이터
        B_type b_type = mData.get(position);

        // 화면에 보여준다
        viewHolder.bikeText.setText(b_type.getA());

        return convertView;
    }

    private static class ViewHolder {
        TextView bikeText;
    }
}
