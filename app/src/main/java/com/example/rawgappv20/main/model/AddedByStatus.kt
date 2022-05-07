package com.example.rawgappv20.main.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class AddedByStatus(
    val yet: Int,
    val owned: Int,
    val beaten: Int,
    val toPlay: Int,
    val dropped: Int,
    val playing: Int
): Parcelable
