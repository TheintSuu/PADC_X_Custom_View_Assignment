package com.example.padc_x_custom_view_assignment.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.padc_x_custom_view_assignment.R
import com.example.padc_x_custom_view_assignment.adapter.TaskFragmentAdapter
import com.example.padc_x_custom_view_assignment.adapter.TaskItemAdapter
import kotlinx.android.synthetic.main.activity_profile_detail.*

class ProfileDetailActivity : AppCompatActivity() {
    private lateinit var mViewPagerAdapter: TaskFragmentAdapter
    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, ProfileDetailActivity::class.java)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_detail)
        setUpViewPager()
    }

    fun setUpViewPager(){
        mViewPagerAdapter = TaskFragmentAdapter(this,supportFragmentManager)
        viewPager.adapter = mViewPagerAdapter
        tabLayout.setupWithViewPager(viewPager)

    }
}