package com.example.rawgappv20.common.basemvp
import androidx.annotation.CallSuper

abstract class BasePresenter<V : MvpView> : MvpPresenter<V> {
    protected var view: V? = null
        private set

    @CallSuper
    override fun attach(view: V) {
        this.view = view
    }

    @CallSuper
    override fun detach() {
        view = null
    }

}