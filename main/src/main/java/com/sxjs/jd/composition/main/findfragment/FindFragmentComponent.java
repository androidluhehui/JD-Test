package com.sxjs.jd.composition.main.findfragment;

import com.sxjs.common.PerFragment;
import com.sxjs.common.AppComponent;

import dagger.Component;

/**
 * Created by admin
 */
@PerFragment
@Component(dependencies = AppComponent.class , modules = FindPresenterModule.class)
public interface FindFragmentComponent {
    void inject(FindFragment fragment);
}
