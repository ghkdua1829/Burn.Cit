package com.fastcampus.burncit.feature.calendar

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fastcampus.burncit.data.model.Calendar
import com.fastcampus.burncit.databinding.ItemCalendarDateBinding

class CalendarAdapter : RecyclerView.Adapter<CalendarAdapter.CalendarViewHolder>() {
    private val calendarData = ArrayList<Calendar>()

    fun setCalendarData(newData: List<Calendar>) {
        with(calendarData) {
            clear()
            addAll(newData)
        }
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CalendarViewHolder {
        val binding: ItemCalendarDateBinding =
            ItemCalendarDateBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CalendarViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CalendarViewHolder, position: Int) {
        holder.bind(calendarData[position])
    }

    override fun getItemCount(): Int {
        return calendarData.size
    }

    class CalendarViewHolder(private val binding: ItemCalendarDateBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(data: Calendar) {
            binding.calendar = data
        }
    }
}