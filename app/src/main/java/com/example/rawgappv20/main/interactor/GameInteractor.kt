package com.example.rawgappv20.main.interactor

import com.example.rawgappv20.main.model.MainGames
import com.example.rawgappv20.main.model.Results
import com.example.rawgappv20.main.repository.GamesRemoteRepository

class GameInteractor(
    private val gamesRemoteRepository: GamesRemoteRepository
) {
    suspend fun getResults() : List<MainGames>{
        gamesRemoteRepository.getResults()
        return gamesRemoteRepository.getResults()
    }
}