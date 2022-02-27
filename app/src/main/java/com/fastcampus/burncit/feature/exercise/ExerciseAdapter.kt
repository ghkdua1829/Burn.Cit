package com.fastcampus.burncit.feature.exercise

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fastcampus.burncit.data.model.Exercise
import com.fastcampus.burncit.databinding.ItemExerciseBinding

class ExerciseAdapter : RecyclerView.Adapter<ExerciseAdapter.ExerciseViewHolder>() {
    private val exerciseData: ArrayList<Exercise> = ArrayList()

    fun setExerciseData(newExerciseData: List<Exercise>) {
        with(exerciseData) {
            clear()
            addAll(newExerciseData)
        }
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseViewHolder {
        val binding: ItemExerciseBinding =
            ItemExerciseBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ExerciseViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ExerciseViewHolder, position: Int) {
        holder.bind(exerciseData[position])
    }

    override fun getItemCount(): Int {
        return exerciseData.size
    }

    class ExerciseViewHolder(private val binding: ItemExerciseBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(data: Exercise) {
            binding.exercise = data
        }
    }
}