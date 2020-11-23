package com.example.tasks.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0013"}, d2 = {"Lcom/example/tasks/viewmodel/TaskFormViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "mPriorityList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/tasks/service/model/PriorityModel;", "mPriorityRepository", "Lcom/example/tasks/service/repository/PriorityRepository;", "priorities", "Landroidx/lifecycle/LiveData;", "getPriorities", "()Landroidx/lifecycle/LiveData;", "setPriorities", "(Landroidx/lifecycle/LiveData;)V", "listPriorities", "", "app_debug"})
public final class TaskFormViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.example.tasks.service.repository.PriorityRepository mPriorityRepository = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.tasks.service.model.PriorityModel>> mPriorityList = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.example.tasks.service.model.PriorityModel>> priorities;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.tasks.service.model.PriorityModel>> getPriorities() {
        return null;
    }
    
    public final void setPriorities(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.tasks.service.model.PriorityModel>> p0) {
    }
    
    public final void listPriorities() {
    }
    
    public TaskFormViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}