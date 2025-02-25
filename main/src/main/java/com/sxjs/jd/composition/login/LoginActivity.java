package com.sxjs.jd.composition.login;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.sxjs.common.base.BaseActivity;
import com.sxjs.common.base.rxjava.ErrorDisposableObserver;
import com.sxjs.jd.MainDataManager;
import com.sxjs.jd.R;
import com.sxjs.jd.R2;

import butterknife.BindView;
import butterknife.ButterKnife;
import okhttp3.ResponseBody;

/**
 * @author admin
 */
@Route(path = "/test/login")
public class LoginActivity extends BaseActivity {

    @BindView(R2.id.tv_onclick)
     TextView tvOnclick;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        ButterKnife.bind(this);
        tvOnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();
            }
        });

    }

    /**
     * 模拟登录网络请求，只做演示无返回
     */
    public void login() {
        addDisposable(MainDataManager.getInstance(mDataManager).login(new ErrorDisposableObserver<ResponseBody>() {
            @Override
            public void onNext(ResponseBody responseBody) {

            }

            @Override
            public void onComplete() {

            }
        }, "mobile", "code"));
    }
}
