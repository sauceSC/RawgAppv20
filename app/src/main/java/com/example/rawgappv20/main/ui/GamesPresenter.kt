package com.example.rawgappv20.main.ui

import com.example.rawgappv20.common.basemvp.BasePresenter
import com.example.rawgappv20.main.interactor.GameInteractor
import com.example.rawgappv20.main.model.genres.GenreGame
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import timber.log.Timber


class GamesPresenter(
    private val gameInteractor: GameInteractor
) : BasePresenter<GamesContract.View>(),
    GamesContract.Presenter {
    private val presenterScope = CoroutineScope(Dispatchers.Main.immediate)

    override fun getGamesList(genre: GenreGame) {
        presenterScope.async {
            try {
                val games = gameInteractor.getGameResults(genre.slug)
                view?.showGames(games, genre.position)
            } catch (throwable: Throwable) {
                throwable.message?.let { Timber.tag("###").e("DDD") }
            }

        }
    }

    override fun getGenres() {
        presenterScope.launch {
            try {
                val genres = gameInteractor.getGenres()
                view?.showGenres(genres)
            } catch (t: Throwable) {
                Timber.e("$t.cause")
            }
        }
    }


}