package com.example.classwork.repository

import com.example.classwork.model.api.RetrofitInstance
import com.example.classwork.model.data.Users
import com.example.classwork.model.data.UsersItem
import com.example.classwork.model.data2.UsersModel
import com.example.classwork.network.ApiService
import javax.inject.Inject

class Repository @Inject constructor(private val apiService: ApiService){
    suspend fun getUsers(): UsersModel {
        return apiService.getUsers()
    }
}