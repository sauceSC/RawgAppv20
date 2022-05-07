package com.example.rawgappv20.main.model

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class ShortScreenshots(
    val id: Int,
    val image: String
): Parcelable
