package com.example.tasks.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/tasks/viewmodel/RegisterViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "create", "Landroidx/lifecycle/LiveData;", "Lcom/example/tasks/service/listener/ValidationListener;", "getCreate", "()Landroidx/lifecycle/LiveData;", "setCreate", "(Landroidx/lifecycle/LiveData;)V", "mCreate", "Landroidx/lifecycle/MutableLiveData;", "mPersonRepository", "Lcom/example/tasks/service/repository/PersonRepository;", "mSharedPreferences", "Lcom/example/tasks/service/repository/local/SecurityPreferences;", "", "name", "", "email", "password", "app_debug"})
public final class RegisterViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.example.tasks.service.repository.PersonRepository mPersonRepository = null;
    private final com.example.tasks.service.repository.local.SecurityPreferences mSharedPreferences = null;
    private final androidx.lifecycle.MutableLiveData<com.example.tasks.service.listener.ValidationListener> mCreate = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<com.example.tasks.service.listener.ValidationListener> create;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.tasks.service.listener.ValidationListener> getCreate() {
        return null;
    }
    
    public final void setCreate(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.example.tasks.service.listener.ValidationListener> p0) {
    }
    
    public final void create(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    public RegisterViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}