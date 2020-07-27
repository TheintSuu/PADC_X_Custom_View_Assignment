package com.example.padc_x_custom_view_assignment.persistence.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.padc_x_custom_view_assignment.data.vos.TasksVO
import com.example.padc_x_custom_view_assignment.persistence.daos.TasksDao

@Database(entities = [TasksVO::class], version = 7, exportSchema = false)
abstract class TasksDB : RoomDatabase(){
    companion object {
        val DB_NAME = "PADC_TASKS_X.DB"
        var dbInstance : TasksDB? = null

        fun getDBInstance(context: Context): TasksDB {
            when (dbInstance) {
                null -> {
                    dbInstance = Room.databaseBuilder(context, TasksDB::class.java, DB_NAME)
                        .allowMainThreadQueries()
                        .fallbackToDestructiveMigration()
                        .build()
                }
            }

            val i = dbInstance
            return i!!
        }
    }

    abstract fun tasksDao(): TasksDao


}