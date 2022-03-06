package com.fastcampus.burncit.feature.calendar

import android.app.ActionBar
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fastcampus.burncit.`object`.Object
import com.fastcampus.burncit.databinding.ItemCalendarDateBinding
import java.text.SimpleDateFormat
import java.util.*
import kotlin.collections.ArrayList

class CalendarAdapter : RecyclerView.Adapter<CalendarAdapter.CalendarViewHolder>() {
    private val calendarData = ArrayList<com.fastcampus.burncit.data.model.Calendar>()
    private lateinit var binding: ItemCalendarDateBinding
    private var widthPixels: Int = 0

    companion object {
        val cal: Calendar = Calendar.getInstance()
        var sizeBack = 0
    }


    init {
        val nowDateCal = cal
        val weekFormat = SimpleDateFormat("EE", Locale.getDefault())
        val dayFormat = SimpleDateFormat("dd", Locale.getDefault())
    }

    fun setCalendarData(startDate: Calendar, backBtnWidth: Int) {
        with(calendarData) {
            clear()
        }
        for (i in 0..7) {
            calendarData.add(
                com.fastcampus.burncit.data.model.Calendar(
                    startDate.time.year,
                    startDate.time.month,
                    startDate.time.date,
                    Object.weekToString(startDate.time.day)
                )
            )
            startDate.add(Calendar.DATE, 1)

        }
        sizeBack = backBtnWidth


        notifyDataSetChanged()
    }

    fun setWidth(backBtnWidth: Int) {
//        sizeBack = backBtnWidth
//        notifyDataSetChanged()
//        binding.itemCalConst.layoutParams = RecyclerView.LayoutParams(
//            (widthPixels- 2 *backBtnWidth) / 7,
//            ActionBar.LayoutParams.WRAP_CONTENT
//        )
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CalendarViewHolder {
        binding =
            ItemCalendarDateBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        widthPixels = parent.context.resources.displayMetrics.widthPixels
        return CalendarViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CalendarViewHolder, position: Int) {
        holder.bind(calendarData[position])
        binding.itemCalConst.layoutParams = RecyclerView.LayoutParams(
            (widthPixels - 2 * sizeBack) / 7,
            ActionBar.LayoutParams.WRAP_CONTENT
        )
    }

    override fun getItemCount(): Int {
        return Math.min(calendarData.size, 7)
    }

    class CalendarViewHolder(private val binding: ItemCalendarDateBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(data: com.fastcampus.burncit.data.model.Calendar) {
            binding.calendar = data
        }
    }
}