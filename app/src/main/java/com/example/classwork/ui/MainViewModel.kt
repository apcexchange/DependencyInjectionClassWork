package com.example.classwork.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.classwork.model.data2.ResultData
import com.example.classwork.model.data2.UsersModel
import com.example.classwork.useCase.DataUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor (private val useCase: DataUseCase) :ViewModel() {

private val _response : MutableLiveData<ResultData<UsersModel>> = MutableLiveData()
    val response : LiveData<ResultData<UsersModel>> get() = _response

    init {
        ResultData.Loading()
    }



    fun getAllUsersList() {
       viewModelScope.launch {
           try {
               ResultData.Loading()
               useCase.getUserList()
               val response = useCase.getUserList()
               _response.postValue(response)

           }catch (e:Exception){
               Log.d("KKK", "getUsersList: $e")
           }
       }
    }
}