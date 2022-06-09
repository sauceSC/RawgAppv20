package com.example.rawgappv20.main.api.game_model

import com.example.rawgappv20.main.api.genres_model.GenreGameResponse
import com.google.gson.annotations.SerializedName

data class GenresResponse(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name:String,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("games_count")
    val gamesCount: Int,
    @SerializedName("image_background")
    val imageBackground: String,

)
