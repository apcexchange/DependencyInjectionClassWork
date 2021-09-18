package com.example.classwork.useCase

import com.example.classwork.model.data2.ResultData
import com.example.classwork.model.data2.UsersModel
import com.example.classwork.repository.Repository
import javax.inject.Inject

class DataUseCase @Inject constructor(private val repository: Repository) {
    suspend fun getUserList(): ResultData<UsersModel> {
        val userRepository = repository.getUsers()

      val resultData = return if (!userRepository.isNullOrEmpty()){
          ResultData.Success(userRepository)
      }else{
          ResultData.Failure("something went wrong")
      }
        return resultData
    }
}