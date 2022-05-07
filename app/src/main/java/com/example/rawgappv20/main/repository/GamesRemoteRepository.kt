package com.example.rawgappv20.main.repository

import android.util.Log
import com.example.rawgappv20.main.api.RawgApi
import com.example.rawgappv20.main.converter.Converter
import com.example.rawgappv20.main.model.Results
import com.example.rawgappv20.utils.Constants

class GamesRemoteRepository(
    val api: RawgApi
) : GamesRepository {

    override suspend fun getResults(): List<Results> {
        Log.i("###", "remrep")
        val data = api.getGames(Constants.API_KEY)
        Log.i("###", "RemoteRepository")
        return Converter.fromNetwork(data)
    }

}