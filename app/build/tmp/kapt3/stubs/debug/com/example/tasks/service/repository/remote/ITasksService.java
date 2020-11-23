package com.example.tasks.service.repository.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\'J6\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\u000b\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'J\u0018\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\'J\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\'J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\'J@\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u0006\u001a\u00020\u0007H\'\u00a8\u0006\u0015"}, d2 = {"Lcom/example/tasks/service/repository/remote/ITasksService;", "", "all", "Lretrofit2/Call;", "", "Lcom/example/tasks/service/model/TaskModel;", "complete", "", "id", "", "create", "priorityId", "description", "", "dueDate", "delete", "load", "nextWeek", "overDue", "undo", "update", "app_debug"})
public abstract interface ITasksService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "Task")
    public abstract retrofit2.Call<java.util.List<com.example.tasks.service.model.TaskModel>> all();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "Task/Next7Days")
    public abstract retrofit2.Call<java.util.List<com.example.tasks.service.model.TaskModel>> nextWeek();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "Task/Overdue")
    public abstract retrofit2.Call<java.util.List<com.example.tasks.service.model.TaskModel>> overDue();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "Task/{id}")
    public abstract retrofit2.Call<com.example.tasks.service.model.TaskModel> load(@retrofit2.http.Path(value = "id", encoded = true)
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "Task")
    public abstract retrofit2.Call<java.lang.Boolean> create(@retrofit2.http.Field(value = "PriorityId")
    int priorityId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "Description")
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "DueDate")
    java.lang.String dueDate, @retrofit2.http.Field(value = "Complete")
    boolean complete);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.HTTP(method = "PUT", path = "Task", hasBody = true)
    public abstract retrofit2.Call<java.lang.Boolean> update(@retrofit2.http.Field(value = "Id")
    int id, @retrofit2.http.Field(value = "PriorityId")
    int priorityId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "description")
    java.lang.String description, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "DuaDate")
    java.lang.String dueDate, @retrofit2.http.Field(value = "Complete")
    boolean complete);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.HTTP(method = "PUT", path = "Task/Complete", hasBody = true)
    public abstract retrofit2.Call<java.lang.Boolean> complete(@retrofit2.http.Field(value = "Id")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.HTTP(method = "PUT", path = "Task/Undo", hasBody = true)
    public abstract retrofit2.Call<java.lang.Boolean> undo(@retrofit2.http.Field(value = "Id")
    int id);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.HTTP(method = "DELETE", path = "Task", hasBody = true)
    public abstract retrofit2.Call<java.lang.Boolean> delete(@retrofit2.http.Field(value = "Id")
    int id);
}