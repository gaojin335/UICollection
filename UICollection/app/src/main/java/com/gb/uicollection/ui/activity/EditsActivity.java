package com.gb.uicollection.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.gb.uicollection.R;
import com.gb.uicollection.ui.view.XEditText;

/**
 * @author gaobo
 * @version V1.0
 * @Description: 显示各种编辑控件的界面
 * @date 16/11/10 下午3:29
 */
public class EditsActivity extends AppCompatActivity {
    private XEditText mXEditText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edits);

        initView();
        initListener();
    }

    private void initView() {
        mXEditText = (XEditText) findViewById(R.id.xet_edits_xEditText);
    }

    private void initListener() {
        mXEditText.setDrawableRightListener(new XEditText.DrawableRightListener() {
            @Override
            public void onDrawableRightClick(View view) {
                Toast.makeText(EditsActivity.this, "输入内容：" + mXEditText.getText().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
