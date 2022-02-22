package com.fastcampus.burncit.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Exercise(
    @PrimaryKey val eid: Int,
    val name: String,
    val picture: String?,
    val star: Boolean,
    val description: String,
    val area: String
)
