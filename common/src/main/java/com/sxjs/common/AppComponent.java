package com.sxjs.common;

import android.content.Context;

import com.sxjs.common.model.DataManager;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by admin
 */

@Singleton
@Component(modules = {ApplicationModule.class})
public interface AppComponent {
    Context getContext();
    DataManager getDataManager();


}
