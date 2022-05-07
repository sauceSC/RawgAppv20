package com.example.rawgappv20.main.api.model

import com.google.gson.annotations.SerializedName

data class ShortScreenshotsResponse(
    @SerializedName("id")
    val id: Int,
    @SerializedName("image")
    val image: String
)
