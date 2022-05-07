package com.example.rawgappv20.main.converter

import android.util.Log
import com.example.rawgappv20.main.api.model.GamesResponse
import com.example.rawgappv20.main.api.model.RatingsResponse
import com.example.rawgappv20.main.api.model.ShortScreenshotsResponse
import com.example.rawgappv20.main.model.Ratings
import com.example.rawgappv20.main.model.Results
import com.example.rawgappv20.main.model.ShortScreenshots

object Converter {
    fun fromNetwork(response: GamesResponse) : List<Results>{
        Log.i("###", "Converter")
        return response.results.map{result ->
            Results(
                id = result.id,
                slug = result.slug,
                name = result.name,
                released = result.released,
                tba = result.tba,
                backgroundImage = result.backgroundImage,
                rating = result.rating,
                ratingTop = result.ratingTop,
                ratingsCount = result.ratingsCount,
                reviewsTextCount = result.reviewsTextCount,
                added = result.added,
                metacritic = result.metacritic,
                playtime = result.playtime,
                suggestionsCount = result.suggestionsCount,
                updated = result.updated,
                saturatedColor = result.saturatedColor,
                dominantColor = result.dominantColor,
                clip = result.clip,
                shortScreenshots = fromNetwork(result.shortScreenshots)
            )
        }
    }

    private fun fromNetwork(response: ShortScreenshotsResponse) =
        ShortScreenshots(
            id = response.id,
            image = response.image
        )


}