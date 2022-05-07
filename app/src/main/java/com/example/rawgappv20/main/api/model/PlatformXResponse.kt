package com.example.rawgappv20.main.api.model


import com.google.gson.annotations.SerializedName

data class PlatformXResponse(
    @SerializedName("id")
    val id: Int,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("games_count")
    val gamesCount: Int,
    @SerializedName("image_background")
    val imageBackground:Int
)