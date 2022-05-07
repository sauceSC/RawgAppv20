package com.example.rawgappv20.main.ui

import android.util.Log
import com.example.rawgappv20.common.basemvp.BasePresenter
import com.example.rawgappv20.main.interactor.GameInteractor
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class GamesPresenter(
    private val gameInteractor: GameInteractor
) : BasePresenter<GamesContract.View>(),
    GamesContract.Presenter {
    private val presenterScope = CoroutineScope(Dispatchers.Main.immediate)
    override fun getGamesList() {
        presenterScope.launch {
            try {
                val data = gameInteractor.getResults()
                Log.i("###", "presenter data")
                view?.showGames(data)
                Log.i("###", "presenter showgames")
            } catch (throwable: Throwable) {
                throwable.message?.let { Log.e("###", it) }
                Log.i("###", "ALARM")
            }

        }
    }


}