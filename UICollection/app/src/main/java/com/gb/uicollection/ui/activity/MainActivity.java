package com.gb.uicollection.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.gb.uicollection.R;
import com.gb.uicollection.adapter.CommonAdapter;
import com.gb.uicollection.adapter.ViewHolder;
import com.gb.uicollection.model.ViewModel;
import com.gb.uicollection.util.UIHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * 主页
 */
public class MainActivity extends AppCompatActivity {
    private ListView mListView;
    private CommonAdapter<ViewModel> mAdapter;
    private List<ViewModel> mDatas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initParam();
        initView();
        initData();
        initListener();
    }

    private void initParam() {
        mDatas = new ArrayList<>();
        mAdapter = new CommonAdapter<ViewModel>(this, mDatas, R.layout.item_main) {
            @Override
            public void convert(ViewHolder helper, ViewModel item) {
                helper.setText(R.id.tv_main_name, item.getName());
                helper.setText(R.id.tv_main_desc, item.getDesc());
            }
        };
    }

    private void initData() {
        ViewModel viewModel = new ViewModel("XEdit", "drawableLeft和drawableRight可以响应事件的EditView");
        mDatas.add(viewModel);
        mListView.setAdapter(mAdapter);
    }

    private void initListener() {
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                ViewModel model = mDatas.get(i);
                if ("XEdit".equals(model.getName())) {
                    UIHelper.showToActivity(MainActivity.this, EditsActivity.class);
                }
            }
        });
    }

    private void initView() {
        mListView = (ListView) findViewById(R.id.lv_main_listview);
    }
}
