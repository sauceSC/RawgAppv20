package com.example.rawgappv20.main.api.model


import com.google.gson.annotations.SerializedName

data class EsrbRatingResponse(
    @SerializedName("id")
    val id: Int,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("name")
    val name: String
)