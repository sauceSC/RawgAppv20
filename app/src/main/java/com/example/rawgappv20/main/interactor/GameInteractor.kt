package com.example.rawgappv20.main.interactor

import com.example.rawgappv20.main.model.games.MainGames
import com.example.rawgappv20.main.model.games.Results
import com.example.rawgappv20.main.model.genres.GenreGame
import com.example.rawgappv20.main.repository.GamesRemoteRepository

class GameInteractor(
    private val gamesRemoteRepository: GamesRemoteRepository
) {
    suspend fun getGameResults(genres: String) : List<Results>{
        return gamesRemoteRepository.getResults(genres)
    }

    suspend fun getGenres() = gamesRemoteRepository.getGenres()
}