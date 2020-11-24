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

    private fun list(call: Call<List<TaskModel>>, listener: IAPIListener<List<TaskModel>>) {
        call.enqueue(object : Callback<List<TaskModel>> {
            override fun onResponse(
                call: Call<List<TaskModel>>,
                response: Response<List<TaskModel>>
            ) {
                if (response.code() != TaskConstants.HTTP.SUCCESS) {
                    val validation: String =
                        Gson().fromJson(response.errorBody()!!.string(), String::class.java)
                    listener.onFalure(validation)
                } else {
                    response.body()?.let { listener.onSuccess(it) }
                }
            }

            override fun onFailure(call: Call<List<TaskModel>>, t: Throwable) {
                listener.onFalure(context.getString(R.string.ERROR_UNEXPECTED))
            }
        })
    }

    fun all(listener: IAPIListener<List<TaskModel>>) {
        val call: Call<List<TaskModel>> = mRemote.all()
        list(call, listener)
    }

    fun nexWeek(listener: IAPIListener<List<TaskModel>>) {
        val call: Call<List<TaskModel>> = mRemote.nextWeek()
        list(call, listener)
    }

    fun overdue(listener: IAPIListener<List<TaskModel>>) {
        val call: Call<List<TaskModel>> = mRemote.overDue()
        list(call, listener)
    }

    fun update(task: TaskModel, listener: IAPIListener<Boolean>) {
        val call: Call<Boolean> =
            mRemote.update(task.id, task.priorityId, task.description, task.dueData, task.complete)

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

    fun updateStatus(id: Int, complete: Boolean, listener: IAPIListener<Boolean>) {
        val call: Call<Boolean> = if (complete) {
            mRemote.complete(id)

        } else {
            mRemote.undo(id)
        }

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

    fun load(id: Int, listener: IAPIListener<TaskModel>) {
        val call: Call<TaskModel> = mRemote.load(id)

        //async
        call.enqueue(object : Callback<TaskModel> {
            override fun onFailure(call: Call<TaskModel>, t: Throwable) {
                listener.onFalure(context.getString(R.string.ERROR_UNEXPECTED))
            }

            override fun onResponse(call: Call<TaskModel>, response: Response<TaskModel>) {
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