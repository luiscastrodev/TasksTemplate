package com.example.tasks.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tasks.service.constants.TaskConstants
import com.example.tasks.service.listener.IAPIListener
import com.example.tasks.service.model.PriorityModel
import com.example.tasks.service.model.TaskModel
import com.example.tasks.service.repository.TaskRepository

class AllTasksViewModel(application: Application) : AndroidViewModel(application) {

    private val mTaskRepository = TaskRepository(application)
    private var mTaskFilter = 0

    private val mList = MutableLiveData<List<TaskModel>>()
    var tasks: LiveData<List<TaskModel>> = mList

    fun list(taskfilter: Int) {

        mTaskFilter = taskfilter

        val listener = object : IAPIListener<List<TaskModel>> {
            override fun onFalure(message: String) {
                mList.value = arrayListOf()
            }

            override fun onSuccess(model: List<TaskModel>) {
                mList.value = model
            }
        }

        if (mTaskFilter == TaskConstants.FILTER.ALL) {
            mTaskRepository.all(listener)
        } else if (mTaskFilter == TaskConstants.FILTER.EXPIRED) {
            mTaskRepository.overdue(listener)
        } else if (mTaskFilter == TaskConstants.FILTER.NEXT){
            mTaskRepository.nexWeek(listener)
        }


    }

    fun delete(id:Int){
        mTaskRepository.delete(id,  object : IAPIListener<Boolean> {
            override fun onFalure(message: String) {
                TODO("Not yet implemented")
            }

            override fun onSuccess(model: Boolean) {
                list(mTaskFilter)
            }

        })
    }

    fun complete(id:Int){
        mTaskRepository.updateStatus(id, true, object : IAPIListener<Boolean> {
            override fun onFalure(message: String) {
                TODO("Not yet implemented")
            }

            override fun onSuccess(model: Boolean) {
                list(mTaskFilter)
            }

        })
    }

    fun undo(id:Int){
        mTaskRepository.updateStatus(id, false, object : IAPIListener<Boolean> {
            override fun onFalure(message: String) {
                TODO("Not yet implemented")
            }

            override fun onSuccess(model: Boolean) {
                list(mTaskFilter)
            }

        })
    }
}