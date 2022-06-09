package com.example.rawgappv20.main.ui

import com.example.rawgappv20.common.basemvp.BaseFragmentContract
import com.example.rawgappv20.common.basemvp.MvpPresenter
import com.example.rawgappv20.common.basemvp.MvpView
import com.example.rawgappv20.main.model.games.MainGames
import com.example.rawgappv20.main.model.games.Results
import com.example.rawgappv20.main.model.genres.GenreGame
import com.example.rawgappv20.main.model.genres.MainGenres

interface GamesContract : BaseFragmentContract {
    interface View : MvpView {
        fun showGames(results: List<Results>, postion: Int)
        fun onFail(throwable: Throwable)
        fun showGenres(genres: MainGenres)
    }

    interface Presenter : MvpPresenter<View> {
        fun getGamesList(genre: GenreGame)
        fun getGenres()
    }

}