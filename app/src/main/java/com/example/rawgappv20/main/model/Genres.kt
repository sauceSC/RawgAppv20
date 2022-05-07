package com.example.rawgappv20.main.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Genres(
    val id: Int,
    val name:String,
    val slug: String,
    val gamesCount: Int,
    val imageBackground: String
): Parcelable
