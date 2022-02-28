package com.fastcampus.burncit.ui.calendar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.fastcampus.burncit.R
import com.fastcampus.burncit.data.model.Calendar
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

        adapter = CalendarAdapter()
        adapter.setCalendarData(listOf(Calendar(1,1,1,"월"),Calendar(1,1,2,"화")))
        binding.actCalRecyclerviewDate.adapter = adapter


    }
}