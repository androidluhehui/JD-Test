package com.sxjs.jd.composition.main;

import com.sxjs.common.AppComponent;
import com.sxjs.common.PerActivity;

import dagger.Component;

/**
 * Created by admin
 */
@PerActivity
@Component(dependencies = AppComponent.class , modules = MainPresenterModule .class)
public interface MainActivityComponent {
    void inject(MainActivity activity);
}
