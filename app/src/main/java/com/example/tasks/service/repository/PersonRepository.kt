package com.example.tasks.service.repository

import android.util.Log
import com.example.tasks.service.HeaderModel
import com.example.tasks.service.repository.remote.IPersonService
import com.example.tasks.service.repository.remote.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PersonRepository {

    private val mRemote = RetrofitClient.createService(IPersonService::class.java)

    fun login(email: String, password: String) {
        val call: Call<HeaderModel> = mRemote.login(email, password)

        //async
        call.enqueue(object : Callback<HeaderModel>  {
            override fun onResponse(call: Call<HeaderModel>, response: Response<HeaderModel>) {
                Log.d("API SUCESS", response.body()!!.name)
            }

            override fun onFailure(call: Call<HeaderModel>, t: Throwable) {
                Log.d("API ERROr",t.toString())
            }


        })
    }
}