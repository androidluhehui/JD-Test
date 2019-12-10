package com.sxjs.jd.composition.main;

import java.util.Map;

/**
 * Created by admin
 */

public interface MainContract {
 interface View {
    void setText(String text);

    void showProgressDialogView();

    void hiddenProgressDialogView();
}

 interface Presenter {
    void getText();

    void destory();

    void saveData();

    Map getData();
}

}