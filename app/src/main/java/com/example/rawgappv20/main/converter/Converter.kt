package com.example.rawgappv20.main.converter

import com.example.rawgappv20.main.api.model.GamesResponse
import com.example.rawgappv20.main.api.model.ResultResponse
import com.example.rawgappv20.main.model.MainGames
import com.example.rawgappv20.utils.Constants.BIGIMAGE_VIEW_TYPE
import com.example.rawgappv20.utils.Constants.NOIMAGE_VIEW_TYPE
import com.example.rawgappv20.utils.Constants.SMALLIMAGE_VIEW_TYPE

object Converter {

    fun fromType(response: GamesResponse): List<MainGames> =
        response.results.map {
            when (val typeRandom = listOf<Int>(1, 2, 3).random()) {
                SMALLIMAGE_VIEW_TYPE -> smallImage(response = it, type = typeRandom)
                BIGIMAGE_VIEW_TYPE -> bigImage(response = it, type = typeRandom)
                NOIMAGE_VIEW_TYPE -> noImage(response = it, type = typeRandom)
                else -> throw IllegalArgumentException("error in Converter")
            }

        }
}

fun smallImage(response: ResultResponse, type: Int): MainGames.SmallImage =
    MainGames.SmallImage(
        image = response.backgroundImage,
        name = response.name,
        metacritic = response.metacritic,
        type = type,
        playtime = response.playtime,
        ratingTop = response.ratingTop
    )

fun bigImage(response: ResultResponse, type: Int): MainGames.Image =
    MainGames.Image(
        image = response.backgroundImage,
        name = response.name,
        metacritic = response.metacritic,
        type = type,
        playtime = response.playtime,
        ratingTop = response.ratingTop
    )

fun noImage(
    response: ResultResponse,
    type: Int
): MainGames.Description =
    MainGames.Description(
        name = response.name,
        image = response.backgroundImage,
        metacritic = response.metacritic,
        type = type,
        playtime = response.playtime,
        ratingTop = response.ratingTop
    )


/*fun fromType(response: ResultResponse): List<MainGames> {
        val list = MainGames.SmallImage(
           image = response.backgroundImage,
            name = response.name,
            metacritic = response.metacritic,
            type = listOf(1, 2, 3).random()Z
        )
        return listOf(list)
    }*/




