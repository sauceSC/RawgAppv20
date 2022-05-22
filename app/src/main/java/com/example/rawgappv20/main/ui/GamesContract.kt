package com.example.rawgappv20.main.ui

import com.example.rawgappv20.common.basemvp.BaseFragmentContract
import com.example.rawgappv20.common.basemvp.MvpPresenter
import com.example.rawgappv20.common.basemvp.MvpView
import com.example.rawgappv20.main.model.MainGames
import com.example.rawgappv20.main.model.Results

interface GamesContract : BaseFragmentContract {
    interface View : MvpView {
        fun showGames(results: List<MainGames>)
        fun onFail(throwable: Throwable)

    }

    interface Presenter : MvpPresenter<View> {
        fun getGamesList()
    }

}