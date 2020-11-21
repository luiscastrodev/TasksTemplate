package com.example.tasks.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/example/tasks/viewmodel/LoginViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "doLogin", "", "email", "", "password", "verifyLoggedUser", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.AndroidViewModel {
    
    /**
     * Faz login usando API
     */
    public final void doLogin(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    /**
     * Verifica se usuário está logado
     */
    public final void verifyLoggedUser() {
    }
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}