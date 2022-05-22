package com.example.rawgappv20.main.repository

import android.util.Log
import com.example.rawgappv20.main.api.RawgApi
import com.example.rawgappv20.main.converter.Converter
import com.example.rawgappv20.main.model.MainGames
import com.example.rawgappv20.main.model.Results
import com.example.rawgappv20.utils.Constants
import timber.log.Timber
import kotlin.random.Random

class GamesRemoteRepository(
    val api: RawgApi
) : GamesRepository {

    override suspend fun getResults(): List<MainGames> {
        val data = api.getGames(Constants.API_KEY)
        return Converter.fromType(data)
    }

}