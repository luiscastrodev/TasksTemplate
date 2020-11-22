package com.example.tasks.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0017\u001a\u00020\u0013R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/tasks/viewmodel/LoginViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "login", "Landroidx/lifecycle/LiveData;", "Lcom/example/tasks/service/listener/ValidationListener;", "getLogin", "()Landroidx/lifecycle/LiveData;", "setLogin", "(Landroidx/lifecycle/LiveData;)V", "mLogin", "Landroidx/lifecycle/MutableLiveData;", "mPersonRepository", "Lcom/example/tasks/service/repository/PersonRepository;", "mSharedPreferences", "Lcom/example/tasks/service/repository/local/SecurityPreferences;", "doLogin", "", "email", "", "password", "verifyLoggedUser", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.example.tasks.service.repository.PersonRepository mPersonRepository = null;
    private final androidx.lifecycle.MutableLiveData<com.example.tasks.service.listener.ValidationListener> mLogin = null;
    private final com.example.tasks.service.repository.local.SecurityPreferences mSharedPreferences = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<com.example.tasks.service.listener.ValidationListener> login;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.tasks.service.listener.ValidationListener> getLogin() {
        return null;
    }
    
    public final void setLogin(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.example.tasks.service.listener.ValidationListener> p0) {
    }
    
    /**
     * Faz login usando API
     */
    public final void doLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    /**
     * Verifica se usuário está logado
     */
    public final void verifyLoggedUser() {
    }
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}