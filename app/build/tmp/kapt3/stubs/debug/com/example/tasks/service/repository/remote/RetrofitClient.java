package com.example.tasks.service.repository.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/example/tasks/service/repository/remote/RetrofitClient;", "", "()V", "Companion", "app_debug"})
public final class RetrofitClient {
    private static retrofit2.Retrofit retrofit;
    private static java.lang.String personKey = "";
    private static java.lang.String tokenKey = "";
    public static final com.example.tasks.service.repository.remote.RetrofitClient.Companion Companion = null;
    
    private RetrofitClient() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004J\u001f\u0010\u000b\u001a\u0002H\f\"\u0004\b\u0000\u0010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\f0\u000e\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/tasks/service/repository/remote/RetrofitClient$Companion;", "", "()V", "personKey", "", "retrofit", "Lretrofit2/Retrofit;", "tokenKey", "addHeader", "", "token", "createService", "S", "serviceClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "getRetrofitInstance", "app_debug"})
    public static final class Companion {
        
        private final retrofit2.Retrofit getRetrofitInstance() {
            return null;
        }
        
        public final void addHeader(@org.jetbrains.annotations.NotNull()
        java.lang.String token, @org.jetbrains.annotations.NotNull()
        java.lang.String personKey) {
        }
        
        public final <S extends java.lang.Object>S createService(@org.jetbrains.annotations.NotNull()
        java.lang.Class<S> serviceClass) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}