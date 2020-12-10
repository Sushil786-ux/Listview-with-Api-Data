package com.example.listapp;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

        @GET("users")
        Call<com.example.listapp.Pojo> getData();
    }
