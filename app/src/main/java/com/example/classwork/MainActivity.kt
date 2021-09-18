package com.example.classwork

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.classwork.model.data2.ResultData
import com.example.classwork.ui.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

//    private val viewModel by viewModels<MainViewModel>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewModel = ViewModelProvider(this).get(
            MainViewModel::class.java)


       viewModel.getAllUsersList()

        viewModel.response.observe(this, Observer { results->
            when (results){
                is ResultData.Loading ->{
                    //handle ui progress bar

                }
                is ResultData.Success ->{
                    results.data
                }
                is ResultData.Failure ->{
                    // toast

                }
                is ResultData.Exceptions ->{
                    //catch exceptions

                }
            }
        })

    }
}