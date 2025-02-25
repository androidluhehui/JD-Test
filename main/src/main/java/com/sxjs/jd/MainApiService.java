package com.sxjs.jd;

import com.sxjs.common.model.http.BaseApiService;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * @author：admin
 */

public interface MainApiService extends BaseApiService{

    @FormUrlEncoded
    @POST("userRegister/login")
    Observable<ResponseBody> login(@Field("mobile")String mobile,@Field("code")String code);
}
