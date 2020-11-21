package com.example.tasks.service.repository

import com.example.tasks.service.repository.remote.IPersonService
import com.example.tasks.service.repository.remote.RetrofitClient

class PersonRepository {

    val remote = RetrofitClient.createService(IPersonService::class.java)

    fun login(email: String, password: String) {
        remote.login(email, password)
    }
}