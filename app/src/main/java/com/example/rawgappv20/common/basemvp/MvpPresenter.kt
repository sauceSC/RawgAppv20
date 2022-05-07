package com.example.rawgappv20.common.basemvp

interface MvpPresenter<V : MvpView> {
    fun attach(view: V)
    fun detach()
}