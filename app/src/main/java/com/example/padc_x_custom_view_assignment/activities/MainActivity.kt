package com.example.padc_x_custom_view_assignment.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.padc_x_custom_view_assignment.R
import com.example.padc_x_custom_view_assignment.adapter.PeopleProfileAdapter
import com.example.padc_x_custom_view_assignment.adapter.TaskItemAdapter
import com.example.padc_x_custom_view_assignment.delegate.ProfileItemDelegate
import com.example.padc_x_custom_view_assignment.delegate.TaskItemDelegate
import com.example.padc_x_custom_view_assignment.mvp.views.OverlapDecoration
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), TaskItemDelegate, ProfileItemDelegate {

    private lateinit var mAdapter: TaskItemAdapter
    private lateinit var mProfileAdapter: PeopleProfileAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        setUpRecyclerView()



    }

    private fun setUpRecyclerView(){
        mAdapter = TaskItemAdapter(this)
        val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
       rvTask.layoutManager = linearLayoutManager
        rvTask.addItemDecoration(OverlapDecoration())
       rvTask.adapter = mAdapter

        mProfileAdapter = PeopleProfileAdapter(this)
        val horizontalLayoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvProfile.layoutManager = horizontalLayoutManager
        rvProfile.adapter = mProfileAdapter
    }

    override fun onTapItem() {

    }

    fun navigateToCreateTask() {
        startActivity(TaskDetailActivity.newIntent(this))
    }

    override fun onTapProfileItem() {

    }
}
