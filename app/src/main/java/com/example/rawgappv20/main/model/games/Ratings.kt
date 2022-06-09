package com.example.rawgappv20.main.model.games

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Ratings(
    val id: Int,
    val title: String,
    val count: Int,
    val percent: Double
): Parcelable
