package com.example.rawgappv20.main.converter

import com.example.rawgappv20.main.api.game_model.GamesResponse
import com.example.rawgappv20.main.api.genres_model.GenreGameResponse
import com.example.rawgappv20.main.api.genres_model.GenreResponse
import com.example.rawgappv20.main.model.games.Genres
import com.example.rawgappv20.main.model.games.Results
import com.example.rawgappv20.main.model.genres.GenreGame
import com.example.rawgappv20.main.model.genres.MainGenres

object Converter {


    fun genreFromNetwork(response: GenreResponse) =
        MainGenres(
            games = genreGamesFromNetwork(response.genres)
        )

    fun genreGamesFromNetwork(genres: List<GenreGameResponse>) =
        genres.map {
            GenreGame(
                name = it.name,
                slug = it.slug
            )
        }


    fun fromNetwork(response: GamesResponse): List<Results> {
        return response.results.map {
            Results(
                name = it.name,
                backgroundImage = it.backgroundImage,
                ratingTop = it.ratingTop,
                metacritic = it.metacritic,
                playtime = it.playtime,
                genre = it.genres.map {
                    Genres(
                        id = it.id,
                        name = it.name,
                        slug = it.slug
                    )
                }
            )
        }
    }
}
