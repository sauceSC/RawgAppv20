package com.example.rawgappv20.main.api.model


import com.google.gson.annotations.SerializedName

data class GamesResponse(
    @SerializedName("count")
    val count: Int,
    @SerializedName("next")
    val next: String,
    @SerializedName("previous")
    val previous: String,
    @SerializedName("results")
    val results: List<ResultResponse>
)