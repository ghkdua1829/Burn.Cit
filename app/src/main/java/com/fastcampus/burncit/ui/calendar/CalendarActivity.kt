package com.fastcampus.burncit.ui.calendar

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.fastcampus.burncit.R
import com.fastcampus.burncit.databinding.ActivityCalendarBinding
import com.fastcampus.burncit.feature.calendar.CalendarAdapter
import org.koin.android.viewmodel.ext.android.viewModel

class CalendarActivity : AppCompatActivity() {
    lateinit var binding: ActivityCalendarBinding
    val calenViewModel: CalendarViewModel by viewModel()
    lateinit var adapter: CalendarAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_calendar)
        binding.lifecycleOwner = this@CalendarActivity
        Log.e("QQ", binding.actCalRecyclerviewDate.width.toString())
        adapter = CalendarAdapter()


    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
//        adapter.setWidth(applicationContext)
        adapter.setCalendarData(CalendarAdapter.cal, binding.actCalImgBack.width)
        binding.actCalRecyclerviewDate.adapter = adapter

        Log.e("!", binding.actCalRecyclerviewDate.width.toString())
        adapter.setWidth(binding.actCalImgBack.width)
    }
}