package com.example.tasks.service.repository.local;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\'J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\'J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\'\u00a8\u0006\f"}, d2 = {"Lcom/example/tasks/service/repository/local/IPriorityDAO;", "", "clear", "", "getDescription", "", "id", "", "list", "", "Lcom/example/tasks/service/model/PriorityModel;", "save", "app_debug"})
public abstract interface IPriorityDAO {
    
    @androidx.room.Insert()
    public abstract void save(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.tasks.service.model.PriorityModel> list);
    
    @androidx.room.Query(value = "DELETE FROM priority")
    public abstract void clear();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM priority")
    public abstract java.util.List<com.example.tasks.service.model.PriorityModel> list();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT description FROM priority WHERE id = :id ")
    public abstract java.lang.String getDescription(int id);
}