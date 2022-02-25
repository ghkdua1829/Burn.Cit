package com.fastcampus.burncit.data.datasource.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.fastcampus.burncit.data.model.Exercise

@Database(entities = [Exercise::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun exerciseDao(): ExerciseDao

    companion object {
        private var appDatabase: AppDatabase? = null
        fun getAppDataBase(context: Context): AppDatabase? {
            when (appDatabase) {
                null -> {
                    appDatabase =
                        Room.databaseBuilder(context, AppDatabase::class.java, "exerciseDB").build()
                }
            }
            return appDatabase
        }
    }
}