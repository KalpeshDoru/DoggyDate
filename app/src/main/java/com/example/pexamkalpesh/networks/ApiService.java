package com.example.pexamkalpesh.networks;

import com.example.pexamkalpesh.models.BaseResponse;
import com.example.pexamkalpesh.models.CommanRequestModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface ApiService {

    String CONTENT_TYPE_APPLICATION_JSON = "Content-Type: application/json";

    // region Login
    /*@Headers({CONTENT_TYPE_APPLICATION_JSON, ApiConstant.API_KEY})*/
    @Headers({"Apikey:g6y10dstw2am8p9u7kfiba4xcvzj5lh3proxieqn"})
    @POST(ApiConstant.LOG_IN)
    Call<BaseResponse> authenticateUser(
            @Body CommanRequestModel requestBody
    );
    //endregion
}