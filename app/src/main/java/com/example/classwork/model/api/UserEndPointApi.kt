package com.example.classwork.model.api

import com.example.classwork.model.data.Users
import com.example.classwork.model.data.UsersItem
import retrofit2.http.GET

interface UserEndPointApi {

    @GET("users")
    suspend fun getUser(): ArrayList<UsersItem>
}