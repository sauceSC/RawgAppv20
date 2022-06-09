package com.example.rawgappv20.main.api.genres_model

import com.google.gson.annotations.SerializedName

data class GenreResponse(
    @SerializedName("count")
    val count: Int,
    @SerializedName("next")
    val next: String,
    @SerializedName("previous")
    val previous: String,
    @SerializedName("results")
    val genres: List<GenreGameResponse>

)
