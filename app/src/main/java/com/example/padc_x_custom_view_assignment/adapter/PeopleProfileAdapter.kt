package com.example.padc_x_custom_view_assignment.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.padc_x_custom_view_assignment.R
import com.example.padc_x_custom_view_assignment.delegate.ProfileItemDelegate
import com.example.padc_x_custom_view_assignment.views.viewholders.ProfileViewHolder


class PeopleProfileAdapter(delegate : ProfileItemDelegate) : RecyclerView.Adapter<ProfileViewHolder> () {

    val mDelegate: ProfileItemDelegate = delegate
    val VIEW_PROFILE = 2244
    val VIEW_ADD = 1122
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {

        when (viewType) {
            VIEW_PROFILE -> {
                val view= LayoutInflater.from(parent.context).inflate(R.layout.item_profile, parent,false)
                return ProfileViewHolder(view, mDelegate)
            }
            VIEW_ADD -> {
                val view= LayoutInflater.from(parent.context).inflate(R.layout.item_profile, parent,false)
                return ProfileViewHolder(view, mDelegate)
            }
        }
        val view= LayoutInflater.from(parent.context).inflate(R.layout.item_profile, parent,false)
        return ProfileViewHolder(view, mDelegate)
    }

    override fun getItemViewType(position: Int): Int {
        when {
            position % 3 == 0 -> {
                return VIEW_PROFILE
            }
            else -> {
                return VIEW_ADD
            }
        }
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 4
    }
}