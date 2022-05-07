package com.example.rawgappv20.main.model

import android.os.Parcelable
import com.example.rawgappv20.main.api.model.*
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class Results(
    val id: Int,
    val slug: String,
    val name: String,
    val released: String,
    val tba: Boolean,
    val backgroundImage: String,
    val rating: Double,
    val ratingTop: Int,
    val ratingsCount: Int,
    val reviewsTextCount: String,
    val added: Int,
    val metacritic: Int,
    val playtime: Int,
    val suggestionsCount: Int,
    val updated: String,
    val saturatedColor: String,
    val dominantColor: String,
    val clip: String,
    val shortScreenshots: ShortScreenshots
) : Parcelable
