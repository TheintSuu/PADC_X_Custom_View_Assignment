package com.example.padc_x_custom_view_assignment.views.viewholders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.padc_x_custom_view_assignment.delegate.ProfileItemDelegate


class ProfileViewHolder (itemView: View, delegate: ProfileItemDelegate) : RecyclerView.ViewHolder(itemView) {
    init {
        itemView.setOnClickListener {
            delegate.onTapProfileItem()

        }
    }

}