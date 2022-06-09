package com.example.rawgappv20.main.api.game_model


import com.google.gson.annotations.SerializedName

data class PlatformXX(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("slug")
    val slug: String?
)