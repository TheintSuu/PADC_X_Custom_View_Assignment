package com.example.padc_x_custom_view_assignment

import android.app.Application
import com.example.padc_x_custom_view_assignment.data.models.impls.TasksModelImpl
import com.example.padc_x_custom_view_assignment.persistence.db.TasksDB

class TasksAppByTSH : Application() {

    override fun onCreate() {
        super.onCreate()
        TasksModelImpl.init(applicationContext)
        deleteAllTasks()
        prepopulateTasks()
    }

    private fun deleteAllTasks(){
//        TasksDB.getDBInstance(applicationContext)
//            .tasksDao().getAlltasks()
    }

    private fun prepopulateTasks(){
        TasksDB.getDBInstance(applicationContext)
            .tasksDao().getAlltasks()
    }
}