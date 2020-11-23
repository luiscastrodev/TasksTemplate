package com.example.tasks.service.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fJ\u001c\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00110\fJ0\u0010\u0012\u001a\u00020\n2\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00142\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fH\u0002J\u001a\u0010\u0015\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fJ\u001a\u0010\u0016\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lcom/example/tasks/service/repository/TaskRepository;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "mRemote", "Lcom/example/tasks/service/repository/remote/ITasksService;", "all", "", "listener", "Lcom/example/tasks/service/listener/IAPIListener;", "", "Lcom/example/tasks/service/model/TaskModel;", "create", "task", "", "list", "call", "Lretrofit2/Call;", "nexWeek", "overdue", "app_debug"})
public final class TaskRepository {
    private final com.example.tasks.service.repository.remote.ITasksService mRemote = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    private final void list(retrofit2.Call<java.util.List<com.example.tasks.service.model.TaskModel>> call, com.example.tasks.service.listener.IAPIListener<java.util.List<com.example.tasks.service.model.TaskModel>> listener) {
    }
    
    public final void all(@org.jetbrains.annotations.NotNull()
    com.example.tasks.service.listener.IAPIListener<java.util.List<com.example.tasks.service.model.TaskModel>> listener) {
    }
    
    public final void nexWeek(@org.jetbrains.annotations.NotNull()
    com.example.tasks.service.listener.IAPIListener<java.util.List<com.example.tasks.service.model.TaskModel>> listener) {
    }
    
    public final void overdue(@org.jetbrains.annotations.NotNull()
    com.example.tasks.service.listener.IAPIListener<java.util.List<com.example.tasks.service.model.TaskModel>> listener) {
    }
    
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