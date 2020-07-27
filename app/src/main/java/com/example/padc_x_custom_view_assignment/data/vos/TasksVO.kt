package com.example.padc_x_custom_view_assignment.data.vos

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName


@Entity(tableName = "tasks")
data class TasksVO (
    @PrimaryKey
    @SerializedName("id") var id: Int = 0,
    @SerializedName("message") var message: Int = 1,
    @SerializedName("attached_files") var attachedFiles : Int = 1,
    @SerializedName("task_status") var taskStatus: String = "",
    @SerializedName("task_type") var taskType: String = "",
    @SerializedName("task_nCount") var task_nCount :Int = 0


)