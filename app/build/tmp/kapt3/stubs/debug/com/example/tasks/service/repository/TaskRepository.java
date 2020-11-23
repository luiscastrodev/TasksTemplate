package com.example.tasks.service.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/tasks/service/repository/TaskRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "mRemote", "Lcom/example/tasks/service/repository/remote/ITasksService;", "create", "", "task", "Lcom/example/tasks/service/model/TaskModel;", "listener", "Lcom/example/tasks/service/listener/IAPIListener;", "", "app_debug"})
public final class TaskRepository {
    private final com.example.tasks.service.repository.remote.ITasksService mRemote = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    public final void create(@org.jetbrains.annotations.NotNull()
    com.example.tasks.service.model.TaskModel task, @org.jetbrains.annotations.NotNull()
    com.example.tasks.service.listener.IAPIListener<java.lang.Boolean> listener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public TaskRepository(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}