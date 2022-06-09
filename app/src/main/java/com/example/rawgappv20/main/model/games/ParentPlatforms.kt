package com.example.rawgappv20.main.model.games

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ParentPlatforms(
    val id: Int,
    val name: String,
    val slug: String
):Parcelable
