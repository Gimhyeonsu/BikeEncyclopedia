package com.ex.bikeencyclopediaapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.ex.bikeencyclopediaapplication.adapter.B_abcd;
import com.ex.bikeencyclopediaapplication.model.B_type;

import java.util.ArrayList;
import java.util.List;

public class ListViewActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView mListView;
    private List<B_type> mData;
    private B_abcd mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainfragment);

        mListView = (ListView) findViewById(R.id.main_list_view);
        // 데이터를 리스트에 추가
        mData = new ArrayList<>();
        mData.add(new B_type("bike"));

        // 어댑터
        mAdapter = new B_abcd(this, mData);

        // 어댑터를 뷰에 설정
        mListView.setAdapter(mAdapter);

        // 이벤트
        mListView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }
}
