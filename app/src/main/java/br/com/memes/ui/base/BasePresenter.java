package br.com.memes.ui.base;

public interface BasePresenter<V extends BaseView> {

    void attachView(V mvpView);

    void detachView();
}
