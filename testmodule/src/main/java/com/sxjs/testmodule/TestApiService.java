package com.sxjs.testmodule;

import com.sxjs.common.model.http.BaseApiService;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * @author：admin
 */

public interface TestApiService extends BaseApiService{

    @FormUrlEncoded
    @POST("userRegister/test")
    Observable<ResponseBody> testData(@Field("xxx") String mobile, @Field("xxx") String code);
}
