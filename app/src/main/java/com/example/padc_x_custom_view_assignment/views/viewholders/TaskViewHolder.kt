package com.example.padc_x_custom_view_assignment.views.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.padc_x_custom_view_assignment.delegate.TaskItemDelegate

class TaskViewHolder (itemView: View, delegate: TaskItemDelegate) : RecyclerView.ViewHolder(itemView) {
    init{
        itemView.setOnClickListener {
            delegate.onTapItem()

        }
    }

}