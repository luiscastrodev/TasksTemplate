package com.example.tasks.service.repository.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.tasks.service.model.PriorityModel

@Dao
interface IPriorityDAO {

    @Insert
    fun save(list: List<PriorityModel>)

    @Query("DELETE FROM priority")
    fun clear()
}