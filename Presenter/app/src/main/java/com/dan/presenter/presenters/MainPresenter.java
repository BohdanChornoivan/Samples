package com.dan.presenter.presenters;

import com.dan.presenter.model.Cat;
import com.dan.presenter.model.ICatsDataSource;

public class MainPresenter extends BasePresenter<IMainViewAction> {


    ICatsDataSource catsDataSource;

    public MainPresenter(ICatsDataSource catsDataSource) {
        this.catsDataSource = catsDataSource;
    }

    public void action() {
        Cat cat = catsDataSource.getCat();
        sendActionToView((view) -> view.showCatsName(cat));
    }

    public void saveNewCat() {
        catsDataSource.saveCat(new Cat("John Snow"));
    }

}
