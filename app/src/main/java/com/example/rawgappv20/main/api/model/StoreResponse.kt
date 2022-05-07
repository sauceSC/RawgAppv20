package com.example.rawgappv20.main.api.model

import com.google.gson.annotations.SerializedName

data class StoreResponse(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("domain")
    val domain: String,
    @SerializedName("games_count")
    val gamesCount: Int,
    @SerializedName("image_background")
    val imgBackground: String
)
