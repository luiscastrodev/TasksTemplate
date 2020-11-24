package com.example.tasks.view

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.DatePicker
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.tasks.R
import com.example.tasks.service.constants.TaskConstants
import com.example.tasks.service.model.PriorityModel
import com.example.tasks.service.model.TaskModel
import com.example.tasks.viewmodel.RegisterViewModel
import com.example.tasks.viewmodel.TaskFormViewModel
import kotlinx.android.synthetic.main.activity_register.*
import kotlinx.android.synthetic.main.activity_register.button_save
import kotlinx.android.synthetic.main.activity_task_form.*
import java.text.SimpleDateFormat
import java.util.*

class TaskFormActivity : AppCompatActivity(), View.OnClickListener,
    DatePickerDialog.OnDateSetListener {

    private lateinit var mViewModel: TaskFormViewModel
    private val mDateFormat = SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)
    private val mListPriority: MutableList<Int> = arrayListOf()
    private var mTaskId: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task_form)

        mViewModel = ViewModelProvider(this).get(TaskFormViewModel::class.java)

        // Inicializa eventos
        listeners()
        observe()

        mViewModel.listPriorities()

        loadDataFromActivity()

    }

    fun loadDataFromActivity() {
        val bunde = intent.extras

        if (bunde != null) {
            mTaskId = bunde.getInt(TaskConstants.BUNDLE.TASKID)
            mViewModel.load(mTaskId)
        }
    }

    override fun onClick(v: View) {
        val id = v.id
        if (id == R.id.button_save) {
            handleSave()
        } else if (id == R.id.button_date) {
            showDataPicker()
        }
    }

    private fun handleSave() {
        val task = TaskModel().apply {
            this.id = mTaskId
            this.description = edit_description.text.toString()
            this.priorityId = mListPriority[spinner_priority.selectedItemPosition]
            this.dueData = button_date.text.toString()
            this.complete = check_complete.isChecked
        }

        mViewModel.save(task)
    }

    private fun showDataPicker() {
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        DatePickerDialog(this, this, year, month, day).show()
    }

    private fun observe() {
        mViewModel.priorities.observe(this, Observer {
            val list: MutableList<String> = arrayListOf()
            for (item in it) {
                list.add(item.description)
                mListPriority.add(item.id)
            }
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, list)
            spinner_priority.adapter = adapter
        })

        mViewModel.validation.observe(this, Observer {
            if (it.sucess()) {
                Toast.makeText(this, "Sucesso!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, it.failure(), Toast.LENGTH_SHORT).show()
            }
        })

        mViewModel.task.observe(this, Observer {
            edit_description.setText(it.description)
            check_complete.isChecked = it.complete

            //val date = SimpleDateFormat("yyyy-MM-dd").parse(it.dueData)
            button_date.text = ""// mDateFormat.format(date)

            spinner_priority.setSelection(getindex(it.priorityId))
        })
    }

    private fun getindex(id: Int): Int {
        var idex = 0
        for(i in 0 until mListPriority.count()){
            if(mListPriority[i] == id){
                idex = i
            }
        }

        return idex
    }

    private fun listeners() {
        button_save.setOnClickListener(this)
        button_date.setOnClickListener(this)
    }

    override fun onDateSet(p0: DatePicker?, year: Int, month: Int, day: Int) {
        val calendar = Calendar.getInstance()
        val str = mDateFormat.format(calendar.time)
        button_date.text = str
    }

}
