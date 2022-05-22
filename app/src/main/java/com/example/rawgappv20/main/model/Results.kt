package com.example.rawgappv20.main.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Results(
    val name: String,
    val backgroundImage: String,
    val ratingTop: Int,
    val metacritic: Int,
    val playtime: Int,
) : Parcelable
