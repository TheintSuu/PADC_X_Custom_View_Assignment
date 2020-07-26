package com.example.padc_x_custom_view_assignment.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.padc_x_custom_view_assignment.R
import com.example.padc_x_custom_view_assignment.adapter.TaskItemAdapter
import com.example.padc_x_custom_view_assignment.delegate.TaskItemDelegate
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), TaskItemDelegate {

    private lateinit var mAdapter: TaskItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        setUpRecyclerView()

        btnAdd.setOnClickListener {
            navigateToCreateTask()
        }

        roundedCornerImageView.setOnClickListener {
            startActivity(ProfileDetailActivity.newIntent(this))
        }

        roundedCornerImageView2.setOnClickListener {
            startActivity(ProfileDetailActivity.newIntent(this))
        }

        roundedCornerImageView3.setOnClickListener {
            startActivity(ProfileDetailActivity.newIntent(this))
        }


    }

    private fun setUpRecyclerView(){
        mAdapter = TaskItemAdapter(this)
        val linearLayoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
       rvTask.layoutManager = linearLayoutManager
       rvTask.adapter = mAdapter
    }

    override fun onTapItem() {

    }

    fun navigateToCreateTask() {
        startActivity(TaskDetailActivity.newIntent(this))
    }
}
