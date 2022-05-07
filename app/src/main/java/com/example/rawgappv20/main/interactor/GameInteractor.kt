package com.example.rawgappv20.main.interactor

import android.util.Log
import com.example.rawgappv20.main.model.Results
import com.example.rawgappv20.main.repository.GamesRemoteRepository

class GameInteractor(
    private val gamesRemoteRepository: GamesRemoteRepository
) {
    suspend fun getResults() : List<Results>{
        Log.i("###", "interr")
        gamesRemoteRepository.getResults()
        Log.i("###", "Interactor")
        return gamesRemoteRepository.getResults()
    }
}