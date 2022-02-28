package com.fastcampus.burncit.di

import com.fastcampus.burncit.data.datasource.local.AppDatabase
import com.fastcampus.burncit.data.repository.ExerciseRepository
import com.fastcampus.burncit.ui.exercise.ExerciseViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val repositoryAppModule = module { single { ExerciseRepository(get()) } }
val viewModelAppModule = module { viewModel { ExerciseViewModel(get()) } }
val exerciseDaoAppModule = module {
    single { get<AppDatabase>().exerciseDao() }
    single { AppDatabase.getAppDataBase(androidContext()) }
}