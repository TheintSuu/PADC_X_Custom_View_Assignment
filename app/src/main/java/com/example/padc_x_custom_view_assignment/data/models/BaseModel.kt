package com.example.padc_x_custom_view_assignment.data.models

import android.content.Context
import com.example.padc_x_custom_view_assignment.persistence.db.TasksDB

abstract class BaseModel {

    protected lateinit var mTaskDB : TasksDB



    fun initDatabase(context: Context) {
        mTaskDB = TasksDB.getDBInstance(context)
    }
}