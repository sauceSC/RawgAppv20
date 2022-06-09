package com.example.rawgappv20.main.repository

import com.example.rawgappv20.main.api.RawgApi
import com.example.rawgappv20.main.api.game_model.GamesResponse
import com.example.rawgappv20.main.api.genres_model.GenreResponse
import com.example.rawgappv20.main.converter.Converter
import com.example.rawgappv20.main.model.games.Games
import com.example.rawgappv20.main.model.games.MainGames
import com.example.rawgappv20.main.model.games.Results
import com.example.rawgappv20.main.model.genres.GenreGame
import com.example.rawgappv20.main.model.genres.MainGenres
import com.example.rawgappv20.utils.Constants
import com.example.rawgappv20.utils.Constants.API_KEY
import timber.log.Timber

class GamesRemoteRepository(
    val api: RawgApi
) : GamesRepository {

    override suspend fun getResults(genres: String): List<Results> {
        val data = api.getGames(API_KEY, genres)
        Timber.tag("###").i("${data.results}")
        return Converter.fromNetwork(data)
    }

    override suspend fun getGenres(): MainGenres {
        val data = api.getGenres(API_KEY)
        Timber.tag("###").i("${data.genres}")
        return Converter.genreFromNetwork(data)
    }

}