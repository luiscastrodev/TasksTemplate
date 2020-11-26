package com.example.tasks.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nJ\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nJ\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\nJ\u000e\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\nR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001a"}, d2 = {"Lcom/example/tasks/viewmodel/AllTasksViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "mList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/tasks/service/model/TaskModel;", "mTaskFilter", "", "mTaskRepository", "Lcom/example/tasks/service/repository/TaskRepository;", "tasks", "Landroidx/lifecycle/LiveData;", "getTasks", "()Landroidx/lifecycle/LiveData;", "setTasks", "(Landroidx/lifecycle/LiveData;)V", "complete", "", "id", "delete", "list", "taskfilter", "undo", "app_debug"})
public final class AllTasksViewModel extends androidx.lifecycle.AndroidViewModel {
    private final com.example.tasks.service.repository.TaskRepository mTaskRepository = null;
    private int mTaskFilter = 0;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.tasks.service.model.TaskModel>> mList = null;
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.example.tasks.service.model.TaskModel>> tasks;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.tasks.service.model.TaskModel>> getTasks() {
        return null;
    }
    
    public final void setTasks(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.tasks.service.model.TaskModel>> p0) {
    }
    
    public final void list(int taskfilter) {
    }
    
    public final void delete(int id) {
    }
    
    public final void complete(int id) {
    }
    
    public final void undo(int id) {
    }
    
    public AllTasksViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}