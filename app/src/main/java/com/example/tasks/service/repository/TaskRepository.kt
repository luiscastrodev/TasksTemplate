package com.example.tasks.service.repository

import android.content.Context
import com.example.tasks.R
import com.example.tasks.service.constants.TaskConstants
import com.example.tasks.service.listener.IAPIListener
import com.example.tasks.service.model.TaskModel
import com.example.tasks.service.repository.remote.ITasksService
import com.example.tasks.service.repository.remote.RetrofitClient
import com.google.gson.Gson
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class TaskRepository(val context: Context) {

    private val mRemote = RetrofitClient.createService(ITasksService::class.java)

    fun create(task: TaskModel, listener: IAPIListener<Boolean>) {
        val call: Call<Boolean> =
            mRemote.create(task.priorityId, task.description, task.dueData, task.complete)

        //async
        call.enqueue(object : Callback<Boolean> {

            override fun onFailure(call: Call<Boolean>, t: Throwable) {
                listener.onFalure(context.getString(R.string.ERROR_UNEXPECTED))
            }

            override fun onResponse(call: Call<Boolean>, response: Response<Boolean>) {
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