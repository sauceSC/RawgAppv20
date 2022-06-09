package com.example.rawgappv20.main.model.games

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class InParentPlatformsLocal(
    val id: Int,
    val name: String,
    val slug: String
): Parcelable
