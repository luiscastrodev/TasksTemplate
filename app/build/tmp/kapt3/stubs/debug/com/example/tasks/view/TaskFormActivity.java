package com.example.tasks.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\u0006\u0010\u0012\u001a\u00020\u0010J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J*\u0010\u001a\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\tH\u0016J\b\u0010 \u001a\u00020\u0010H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lcom/example/tasks/view/TaskFormActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/view/View$OnClickListener;", "Landroid/app/DatePickerDialog$OnDateSetListener;", "()V", "mDateFormat", "Ljava/text/SimpleDateFormat;", "mListPriority", "", "", "mTaskId", "mViewModel", "Lcom/example/tasks/viewmodel/TaskFormViewModel;", "getindex", "id", "handleSave", "", "listeners", "loadDataFromActivity", "observe", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDateSet", "p0", "Landroid/widget/DatePicker;", "year", "month", "day", "showDataPicker", "app_debug"})
public final class TaskFormActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.View.OnClickListener, android.app.DatePickerDialog.OnDateSetListener {
    private com.example.tasks.viewmodel.TaskFormViewModel mViewModel;
    private final java.text.SimpleDateFormat mDateFormat = null;
    private final java.util.List<java.lang.Integer> mListPriority = null;
    private int mTaskId = 0;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void loadDataFromActivity() {
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View v) {
    }
    
    private final void handleSave() {
    }
    
    private final void showDataPicker() {
    }
    
    private final void observe() {
    }
    
    private final int getindex(int id) {
        return 0;
    }
    
    private final void listeners() {
    }
    
    @java.lang.Override()
    public void onDateSet(@org.jetbrains.annotations.Nullable()
    android.widget.DatePicker p0, int year, int month, int day) {
    }
    
    public TaskFormActivity() {
        super();
    }
}