package com.sxjs.testmodule;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.launcher.ARouter;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * 22@author：admin
 */

public class TestModuleMainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_main_activity);
        ButterKnife.bind(this);

    }


    @OnClick(R.id.to_test_activity)
    public void onClick() {
        ARouter.getInstance().build("/test1/activity").greenChannel().navigation();
    }
}
