package com.example.tasks.view.viewholder;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/tasks/view/viewholder/TaskViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "listener", "Lcom/example/tasks/service/listener/TaskListener;", "(Landroid/view/View;Lcom/example/tasks/service/listener/TaskListener;)V", "getListener", "()Lcom/example/tasks/service/listener/TaskListener;", "mImageTask", "Landroid/widget/ImageView;", "mPriorityRepository", "Lcom/example/tasks/service/repository/PriorityRepository;", "mTextDescription", "Landroid/widget/TextView;", "mTextDueDate", "mTextPriority", "bindData", "", "task", "Lcom/example/tasks/service/model/TaskModel;", "app_debug"})
public final class TaskViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
    private final com.example.tasks.service.repository.PriorityRepository mPriorityRepository = null;
    private android.widget.TextView mTextDescription;
    private android.widget.TextView mTextPriority;
    private android.widget.TextView mTextDueDate;
    private android.widget.ImageView mImageTask;
    @org.jetbrains.annotations.NotNull()
    private final com.example.tasks.service.listener.TaskListener listener = null;
    
    /**
     * Atribui valores aos elementos de interface e também eventos
     */
    public final void bindData(@org.jetbrains.annotations.NotNull()
    com.example.tasks.service.model.TaskModel task) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.tasks.service.listener.TaskListener getListener() {
        return null;
    }
    
    public TaskViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.View itemView, @org.jetbrains.annotations.NotNull()
    com.example.tasks.service.listener.TaskListener listener) {
        super(null);
    }
}