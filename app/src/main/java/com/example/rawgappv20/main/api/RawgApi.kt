package com.example.rawgappv20.main.api

import com.example.rawgappv20.main.api.game_model.GamesResponse
import com.example.rawgappv20.main.api.game_model.GenresResponse
import com.example.rawgappv20.main.api.genres_model.GenreGameResponse
import com.example.rawgappv20.main.api.genres_model.GenreResponse
import com.example.rawgappv20.main.model.genres.GenreGame
import retrofit2.http.GET
import retrofit2.http.Query

interface RawgApi {
    @GET("games")
    suspend fun getGames(
        @Query("key") key: String,
        @Query("genres") genres: String
    ): GamesResponse

    @GET("genres")
    suspend fun getGenres(
        @Query("key") key: String
    ): GenreResponse
}