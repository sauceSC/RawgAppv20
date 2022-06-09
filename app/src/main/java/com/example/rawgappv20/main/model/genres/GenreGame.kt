package com.example.rawgappv20.main.model.genres

import android.os.Parcelable
import com.example.rawgappv20.main.model.games.Results
import kotlinx.parcelize.Parcelize

@Parcelize
data class GenreGame(
    val name: String,
    val slug: String,
    val games: MutableList<Results> = mutableListOf(),
    var position: Int = 0
) : Parcelable