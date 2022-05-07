package com.example.rawgappv20.main.api

import com.example.rawgappv20.main.api.model.GamesResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface RawgApi {
    @GET("games")
    suspend fun getGames(
        @Query("key")
        key: String
    ): GamesResponse
}