package com.example.tasks.service.listener

import com.example.tasks.service.model.HeaderModel

interface IAPIListener <T> {
    fun onFalure(message: String)
    fun onSuccess(model: T)
}