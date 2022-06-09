package com.example.rawgappv20.main.api.game_model


import com.google.gson.annotations.SerializedName

data class PlatformResponse(
    @SerializedName("platform")
    val platform: PlatformXResponse,
    @SerializedName("released_at")
    val releasedAt: String,
    @SerializedName("requirements")
    val requirements: RequirementsResponse
)