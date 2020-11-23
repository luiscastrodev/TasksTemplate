package com.example.tasks.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cJ\u0006\u0010\u001e\u001a\u00020\u001aR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/example/tasks/viewmodel/LoginViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "loggedUser", "Landroidx/lifecycle/LiveData;", "", "getLoggedUser", "()Landroidx/lifecycle/LiveData;", "setLoggedUser", "(Landroidx/lifecycle/LiveData;)V", "login", "Lcom/example/tasks/service/listener/ValidationListener;", "getLogin", "setLogin", "mLoggedUser", "Landroidx/lifecycle/MutableLiveData;", "mLogin", "mPersonRepository", "Lcom/example/tasks/service/repository/PersonRepository;", "mPriotityRepository", "Lcom/example/tasks/service/repository/PriorityRepository;", "mSharedPreferences", "Lcom/example/tasks/service/repository/local/SecurityPreferences;", "doLogin", "", "email", "", "password", "verifyLoggedUser", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.example.tasks.service.repository.PersonRepository mPersonRepository = null;
    private final com.example.tasks.service.repository.PriorityRepository mPriotityRepository = null;
    private final com.example.tasks.service.repository.local.SecurityPreferences mSharedPreferences = null;
    private final androidx.lifecycle.MutableLiveData<com.example.tasks.service.listener.ValidationListener> mLogin = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<com.example.tasks.service.listener.ValidationListener> login;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> mLoggedUser = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.lang.Boolean> loggedUser;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.tasks.service.listener.ValidationListener> getLogin() {
        return null;
    }
    
    public final void setLogin(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.example.tasks.service.listener.ValidationListener> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getLoggedUser() {
        return null;
    }
    
    public final void setLoggedUser(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.lang.Boolean> p0) {
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