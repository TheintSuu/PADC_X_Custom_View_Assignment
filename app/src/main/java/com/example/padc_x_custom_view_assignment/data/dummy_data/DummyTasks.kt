package com.example.padc_x_custom_view_assignment.data.dummy_data

import com.example.padc_x_custom_view_assignment.data.vos.TasksVO


fun getDummyTasks() : List<TasksVO>{
    val taskOne = TasksVO()
    taskOne.attachedFiles = 5
    taskOne.message = 3
    taskOne.task_nCount = 163
    taskOne.taskStatus = "In progress"
    taskOne.taskType = "#Design"

    val taskTwo = TasksVO()
    taskTwo.attachedFiles = 2
    taskTwo.message = 8
    taskTwo.task_nCount = 158
    taskTwo.taskStatus = "Done"
    taskTwo.taskType = "#Design"

    val taskThree = TasksVO()
    taskThree.attachedFiles = 8
    taskThree.message = 4
    taskThree.task_nCount = 157
    taskThree.taskStatus = "Review"
    taskThree.taskType = "#Frontend"

    return arrayListOf(taskOne,taskTwo,taskThree)
}