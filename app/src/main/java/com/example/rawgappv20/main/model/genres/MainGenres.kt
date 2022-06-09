package com.example.rawgappv20.main.model.genres

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MainGenres(
    val games: List<GenreGame>
) : Parcelable
