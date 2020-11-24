package com.example.tasks.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tasks.service.listener.IAPIListener
import com.example.tasks.service.model.PriorityModel
import com.example.tasks.service.model.TaskModel
import com.example.tasks.service.repository.TaskRepository

class AllTasksViewModel(application: Application) : AndroidViewModel(application) {

    private val mTaskRepository = TaskRepository(application)

    private val mList = MutableLiveData<List<TaskModel>>()
    var tasks: LiveData<List<TaskModel>> = mList

    fun list(){
        mTaskRepository.all(object : IAPIListener<List<TaskModel>> {
            override fun onFalure(message: String) {
                mList.value = arrayListOf()
            }
            override fun onSuccess(model: List<TaskModel>) {
                mList.value = model
            }
        })
    }

    fun complete(id:Int){
        mTaskRepository.updateStatus(id, true, object : IAPIListener<Boolean> {
            override fun onFalure(message: String) {
                TODO("Not yet implemented")
            }

            override fun onSuccess(model: Boolean) {
                list()
            }

        })
    }

    fun undo(id:Int){
        mTaskRepository.updateStatus(id, false, object : IAPIListener<Boolean> {
            override fun onFalure(message: String) {
                TODO("Not yet implemented")
            }

            override fun onSuccess(model: Boolean) {
                list()
            }

        })
    }
}