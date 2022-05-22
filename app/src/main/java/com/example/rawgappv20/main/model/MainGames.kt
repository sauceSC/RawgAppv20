package com.example.rawgappv20.main.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

sealed class MainGames : Parcelable {
    abstract var type: Int?
    abstract val playtime: Int
    abstract val ratingTop: Int
    abstract val image: String
    abstract val name: String
    abstract val metacritic: Int

    @Parcelize
    data class SmallImage(
        override var type: Int?,
        override val playtime: Int,
        override val ratingTop: Int,
        override val image: String,
        override val name: String,
        override val metacritic: Int
    ) :
        MainGames()

    @Parcelize
    data class Description(
        override var type: Int?,
        override val playtime: Int,
        override val ratingTop: Int,
        override val image: String,
        override val name: String,
        override val metacritic: Int
    ) :
        MainGames()

    @Parcelize
    data class Image(
        override var type: Int?,
        override val playtime: Int,
        override val ratingTop: Int,
        override val image: String,
        override val name: String,
        override val metacritic: Int
    ) :
        MainGames()


}


