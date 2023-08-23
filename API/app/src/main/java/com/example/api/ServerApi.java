package com.example.api;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ServerApi {
    @POST("user/login")
    Call<Void> signup(
            @Body SignUpRequest signUpRequest
    );
}
