package com.example.rawgappv20.main.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PlatformX (
    val id: Int?,
    val slug: String?,
    val name: String?,
    val image: String?,
    val gamesCount: Int?,
    val imageBackground:String?
) : Parcelable