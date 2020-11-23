package com.example.tasks.service.listener

import com.example.tasks.service.model.HeaderModel

interface IAPIListener {
    fun onSuccess(model: HeaderModel)
    fun onFalure(message: String)
}