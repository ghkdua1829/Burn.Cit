package com.fastcampus.burncit.data.repository

import com.fastcampus.burncit.data.datasource.local.AppDatabase

class ExerciseRepository(private val appDatabase: AppDatabase) {

    fun getExerciseAll() = appDatabase.exerciseDao().getExerciseAll()
}