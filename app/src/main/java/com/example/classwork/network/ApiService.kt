package com.example.classwork.network

import com.example.classwork.model.data.UsersItem
import com.example.classwork.model.data2.UsersModel
import com.example.classwork.util.Constants
import retrofit2.http.GET


//endPoint interface
interface ApiService {
    @GET(Constants.END_POINT)
    suspend fun getUsers(): UsersModel
}