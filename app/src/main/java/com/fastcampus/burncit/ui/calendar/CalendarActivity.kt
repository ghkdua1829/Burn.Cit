package com.fastcampus.burncit.ui.calendar

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.ViewTreeObserver
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
    lateinit var mGlobalLayoutListener:ViewTreeObserver.OnGlobalLayoutListener
    private fun removeOnGlobalLayoutListener(
        observer: ViewTreeObserver,
        listener: ViewTreeObserver.OnGlobalLayoutListener
    ) {
        if (observer == null) {
            return
        }
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN) {
            observer.removeOnGlobalLayoutListener(listener)
        } else {
            observer.removeOnGlobalLayoutListener(listener)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_calendar)
        binding.lifecycleOwner = this@CalendarActivity
        Log.e("QQ", binding.actCalRecyclerviewDate.width.toString())
        adapter = CalendarAdapter()
        adapter.setCalendarData(CalendarAdapter.cal)
        binding.actCalRecyclerviewDate.adapter = adapter

        mGlobalLayoutListener = ViewTreeObserver.OnGlobalLayoutListener {
            Log.e("mGlobal", binding.actCalImgBack.width.toString())
            adapter.setWidth(binding.actCalImgBack.width)
            removeOnGlobalLayoutListener(binding.mParentLayout.viewTreeObserver,mGlobalLayoutListener)
        }
        binding.mParentLayout.viewTreeObserver.addOnGlobalLayoutListener(mGlobalLayoutListener)


    }

//    override fun onWindowFocusChanged(hasFocus: Boolean) {
//        super.onWindowFocusChanged(hasFocus)
//        CalendarAdapter.sizeBack = binding.actCalRecyclerviewDate.width
//
//        Log.e("!", binding.actCalRecyclerviewDate.width.toString())
////        adapter.setWidth(binding.actCalImgBack.width)
//    }
}