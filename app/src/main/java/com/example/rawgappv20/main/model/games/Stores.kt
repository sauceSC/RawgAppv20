package com.example.rawgappv20.main.model.games

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Stores(
    val id: Int,
    val store: Store
):Parcelable
