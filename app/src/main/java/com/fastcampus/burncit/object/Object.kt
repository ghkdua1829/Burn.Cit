package com.fastcampus.burncit.`object`

object Object {

    fun weekToString(it: Int): String {
        return when (it) {
            0 -> "일"
            1 -> "월"
            2 -> "화"
            3 -> "수"
            4 -> "목"
            5 -> "금"
            6 -> "토"
            else -> ""
        }
    }
}