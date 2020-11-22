package com.example.tasks.service.listener;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\b\u001a\u00020\u0003J\u0006\u0010\t\u001a\u00020\u0007R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/tasks/service/listener/ValidationListener;", "", "str", "", "(Ljava/lang/String;)V", "mMessage", "mStatus", "", "failure", "sucess", "app_debug"})
public final class ValidationListener {
    private boolean mStatus = true;
    private java.lang.String mMessage = "";
    
    public final boolean sucess() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String failure() {
        return null;
    }
    
    public ValidationListener(@org.jetbrains.annotations.NotNull()
    java.lang.String str) {
        super();
    }
    
    public ValidationListener() {
        super();
    }
}