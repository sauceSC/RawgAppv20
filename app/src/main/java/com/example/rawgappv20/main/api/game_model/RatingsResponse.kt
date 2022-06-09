package com.example.rawgappv20.main.api.game_model


import com.google.gson.annotations.SerializedName

data class RatingsResponse(
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("count")
    val count: Int,
    @SerializedName("percent")
    val percent: Double


)