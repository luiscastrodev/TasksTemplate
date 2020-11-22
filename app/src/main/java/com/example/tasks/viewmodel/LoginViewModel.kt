package com.example.tasks.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.tasks.service.HeaderModel
import com.example.tasks.service.constants.TaskConstants
import com.example.tasks.service.listener.IAPIListener
import com.example.tasks.service.listener.ValidationListener
import com.example.tasks.service.repository.PersonRepository
import com.example.tasks.service.repository.local.SecurityPreferences

class LoginViewModel(application: Application) : AndroidViewModel(application) {

    private val mPersonRepository = PersonRepository(application)
    private val mLogin = MutableLiveData<ValidationListener>()
    private val mSharedPreferences = SecurityPreferences(application)
    var login: LiveData<ValidationListener> = mLogin

    /**
     * Faz login usando API
     */
    fun doLogin(email: String, password: String) {
        mPersonRepository.login(email, password, object : IAPIListener {
            override fun onSuccess(model: HeaderModel) {

                mSharedPreferences.store(TaskConstants.SHARED.TOKEN_KEY, model.token)
                mSharedPreferences.store(TaskConstants.SHARED.PERSON_KEY, model.personKey)
                mSharedPreferences.store(TaskConstants.SHARED.PERSON_NAME, model.name)

                mLogin.value = ValidationListener()
            }

            override fun onFalure(message: String) {
                mLogin.value = ValidationListener(message)
            }
        })
    }

    /**
     * Verifica se usuário está logado
     */
    fun verifyLoggedUser() {

    }

}