package com.sxjs.jd.composition.main.classificationfragment;

import com.sxjs.common.PerFragment;
import com.sxjs.common.AppComponent;

import dagger.Component;

/**
 * Created by admin
 */
@PerFragment
@Component(dependencies = AppComponent.class , modules = ClassificationPresenterModule.class)
public interface ClassificationFragmentComponent {
    void inject(ClassificationFragment fragment);
}
