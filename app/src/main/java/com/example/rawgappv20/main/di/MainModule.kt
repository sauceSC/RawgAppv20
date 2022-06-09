package com.example.rawgappv20.main.di
import com.example.rawgappv20.main.interactor.GameInteractor
import com.example.rawgappv20.main.repository.GamesRemoteRepository
import com.example.rawgappv20.main.ui.GamesContract
import com.example.rawgappv20.main.ui.GamesPresenter
import org.koin.core.module.dsl.factoryOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

object MainModule {
    fun create() = module {
        singleOf (::GamesPresenter)  bind GamesContract.Presenter::class
        factoryOf(::GameInteractor)
        singleOf(::GamesRemoteRepository)
    }
}