package com.example.padc_x_custom_view_assignment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.padc_x_custom_view_assignment.R
import com.example.padc_x_custom_view_assignment.delegate.TaskItemDelegate
import com.example.padc_x_custom_view_assignment.views.viewholders.TaskViewHolder


class TaskItemAdapter(delegate: TaskItemDelegate) : RecyclerView.Adapter<TaskViewHolder> (){
    val mDelegate : TaskItemDelegate = delegate
    val VIEW_TYPE_LARGE=2244
    val VIEW_TYPE_SMALL=1122
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {

        val view=LayoutInflater.from(parent.context).inflate(R.layout.task_item_view,parent,false)
        return TaskViewHolder(view, mDelegate)

    }

    override fun getItemCount(): Int {
        return 7
    }


    override fun getItemViewType(position: Int): Int {
        when{
            position%3==0 -> { return VIEW_TYPE_LARGE
            }
            else -> { return VIEW_TYPE_SMALL

            }
        }
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {

    }

}