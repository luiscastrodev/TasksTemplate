package com.example.tasks.service.repository

import android.content.Context
import android.util.Log
import com.example.tasks.R
import com.example.tasks.service.HeaderModel
import com.example.tasks.service.constants.TaskConstants
import com.example.tasks.service.listener.IAPIListener
import com.example.tasks.service.repository.remote.IPersonService
import com.example.tasks.service.repository.remote.RetrofitClient
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PersonRepository(val context: Context) {

    private val mRemote = RetrofitClient.createService(IPersonService::class.java)

    fun login(email: String, password: String, listener: IAPIListener) {
        val call: Call<HeaderModel> = mRemote.login(email, password)
        //async
        call.enqueue(object : Callback<HeaderModel> {

            override fun onFailure(call: Call<HeaderModel>, t: Throwable) {
                listener.onFalure(context.getString(R.string.ERROR_UNEXPECTED))
            }

            override fun onResponse(call: Call<HeaderModel>, response: Response<HeaderModel>) {
                if (response.code() != TaskConstants.HTTP.SUCCESS) {
                    val validation: String =
                        Gson().fromJson(response.errorBody()!!.string(), String::class.java)
                    listener.onFalure(validation)
                } else {
                    response.body()?.let { listener.onSuccess(it) }
                }
            }
        })
    }

    fun create(name: String, email: String, password: String, listener: IAPIListener) {
        val call: Call<HeaderModel> = mRemote.create(email, password, name)
        //async
        call.enqueue(object : Callback<HeaderModel> {

            override fun onFailure(call: Call<HeaderModel>, t: Throwable) {
                listener.onFalure(context.getString(R.string.ERROR_UNEXPECTED))
            }

            override fun onResponse(call: Call<HeaderModel>, response: Response<HeaderModel>) {
                if (response.code() != TaskConstants.HTTP.SUCCESS) {
                    val validation: String =
                        Gson().fromJson(response.errorBody()!!.string(), String::class.java)
                    listener.onFalure(validation)
                } else {
                    response.body()?.let { listener.onSuccess(it) }
                }
            }
        })
    }
}