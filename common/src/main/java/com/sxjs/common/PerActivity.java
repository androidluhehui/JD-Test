package com.sxjs.common;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by admin
 */
@Scope
@Documented
@Retention(RUNTIME)
public @interface PerActivity {
}
