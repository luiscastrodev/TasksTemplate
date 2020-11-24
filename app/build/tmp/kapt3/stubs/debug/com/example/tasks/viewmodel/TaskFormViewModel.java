package com.example.tasks.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\fR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016\u00a8\u0006#"}, d2 = {"Lcom/example/tasks/viewmodel/TaskFormViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "mPriorityList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/tasks/service/model/PriorityModel;", "mPriorityRepository", "Lcom/example/tasks/service/repository/PriorityRepository;", "mTask", "Lcom/example/tasks/service/model/TaskModel;", "mTaskRepository", "Lcom/example/tasks/service/repository/TaskRepository;", "mValidation", "Lcom/example/tasks/service/listener/ValidationListener;", "priorities", "Landroidx/lifecycle/LiveData;", "getPriorities", "()Landroidx/lifecycle/LiveData;", "setPriorities", "(Landroidx/lifecycle/LiveData;)V", "task", "getTask", "setTask", "validation", "getValidation", "setValidation", "listPriorities", "", "load", "id", "", "save", "app_debug"})
public final class TaskFormViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.example.tasks.service.repository.PriorityRepository mPriorityRepository = null;
    private final com.example.tasks.service.repository.TaskRepository mTaskRepository = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.tasks.service.model.PriorityModel>> mPriorityList = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.example.tasks.service.model.PriorityModel>> priorities;
    private final androidx.lifecycle.MutableLiveData<com.example.tasks.service.listener.ValidationListener> mValidation = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<com.example.tasks.service.listener.ValidationListener> validation;
    private final androidx.lifecycle.MutableLiveData<com.example.tasks.service.model.TaskModel> mTask = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<com.example.tasks.service.model.TaskModel> task;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.tasks.service.model.PriorityModel>> getPriorities() {
        return null;
    }
    
    public final void setPriorities(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.tasks.service.model.PriorityModel>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.tasks.service.listener.ValidationListener> getValidation() {
        return null;
    }
    
    public final void setValidation(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.example.tasks.service.listener.ValidationListener> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.tasks.service.model.TaskModel> getTask() {
        return null;
    }
    
    public final void setTask(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<com.example.tasks.service.model.TaskModel> p0) {
    }
    
    public final void listPriorities() {
    }
    
    public final void save(@org.jetbrains.annotations.NotNull()
    com.example.tasks.service.model.TaskModel task) {
    }
    
    public final void load(int id) {
    }
    
    public TaskFormViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}