package br.com.memesbb21.ui.base

class BaseContract {

    interface Presenter<in T> {
        fun attach(view: T)
        fun detach()
    }

    interface View {

    }

    interface Model<in T> {
        fun subscribe()
        fun unsubscribe()
        fun attach(presenter: T)
    }
}