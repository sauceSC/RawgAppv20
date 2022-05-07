package com.example.rawgappv20.main.di
import com.example.rawgappv20.main.interactor.GameInteractor
import com.example.rawgappv20.main.repository.GamesRemoteRepository
import com.example.rawgappv20.main.ui.GamesContract
import com.example.rawgappv20.main.ui.GamesPresenter
import org.koin.dsl.bind
import org.koin.dsl.module

object MainModule {
    fun create() = module {
        single { GamesPresenter(get()) } bind GamesContract.Presenter::class
        factory {
            val interactor = GameInteractor(get())
            interactor
        } bind GameInteractor::class
        single <GamesRemoteRepository> {GamesRemoteRepository(get())}
    }
}