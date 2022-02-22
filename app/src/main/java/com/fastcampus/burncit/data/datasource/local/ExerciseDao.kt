package com.fastcampus.burncit.data.datasource.local

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.fastcampus.burncit.data.model.Exercise

@Dao
interface ExerciseDao {
    @Query("Select * from Exercise")
    fun getExerciseAll(): List<Exercise>

    @Insert
    fun insertExercise(exercise: Exercise)

}