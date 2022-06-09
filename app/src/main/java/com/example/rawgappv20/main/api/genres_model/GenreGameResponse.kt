package com.example.rawgappv20.main.api.genres_model

import com.google.gson.annotations.SerializedName

data class GenreGameResponse(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("added")
    val added: Int
)
