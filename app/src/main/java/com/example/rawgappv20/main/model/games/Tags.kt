package com.example.rawgappv20.main.model.games

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Tags(
    val id: Int,
    val name: String,
    val slug: String,
    val lang: String,
    val gamesCount: Int,
    val imgBackground: String
) : Parcelable
