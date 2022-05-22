package com.example.rawgappv20.main.repository

import com.example.rawgappv20.main.model.MainGames
import com.example.rawgappv20.main.model.Results

interface GamesRepository {
    suspend fun getResults(): List<MainGames>
}