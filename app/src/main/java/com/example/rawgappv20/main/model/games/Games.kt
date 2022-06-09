package com.example.rawgappv20.main.model.games
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Games(
    val results: List<Results>
) : Parcelable
