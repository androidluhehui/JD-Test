package com.sxjs.common;

import android.content.Context;

import dagger.Module;
import dagger.Provides;

/**
 * Created by admin
 */
@Module
public class ApplicationModule {
    private final Context mContext;
    public ApplicationModule(Context context) {
        mContext = context;
    }

    @Provides
    Context provideContext() {
        return mContext;
    }




}
