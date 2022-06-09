package com.example.rawgappv20.main.repository

import com.example.rawgappv20.main.api.game_model.GamesResponse
import com.example.rawgappv20.main.model.games.MainGames
import com.example.rawgappv20.main.model.games.Results
import com.example.rawgappv20.main.model.genres.GenreGame
import com.example.rawgappv20.main.model.genres.MainGenres

interface GamesRepository {
    suspend fun getResults(genres: String): List<Results>

    suspend fun getGenres(): MainGenres
}