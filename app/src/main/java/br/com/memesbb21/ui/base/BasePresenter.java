package br.com.memesbb21.ui.base;

public interface BasePresenter<V extends BaseView> {

    void attachView(V mvpView);

    void detachView();
}
