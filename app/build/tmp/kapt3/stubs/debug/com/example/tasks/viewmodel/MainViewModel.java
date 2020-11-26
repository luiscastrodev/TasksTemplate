package com.example.tasks.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0012"}, d2 = {"Lcom/example/tasks/viewmodel/MainViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "mSharedPreferences", "Lcom/example/tasks/service/repository/local/SecurityPreferences;", "mUserName", "Landroidx/lifecycle/MutableLiveData;", "", "userName", "Landroidx/lifecycle/LiveData;", "getUserName", "()Landroidx/lifecycle/LiveData;", "setUserName", "(Landroidx/lifecycle/LiveData;)V", "loadUserName", "", "app_debug"})
public final class MainViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.example.tasks.service.repository.local.SecurityPreferences mSharedPreferences = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.String> mUserName = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.lang.String> userName;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.String> getUserName() {
        return null;
    }
    
    public final void setUserName(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.lang.String> p0) {
    }
    
    public final void loadUserName() {
    }
    
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}