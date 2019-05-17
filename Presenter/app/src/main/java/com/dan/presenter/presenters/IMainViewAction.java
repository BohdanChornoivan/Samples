package com.dan.presenter.presenters;

import com.dan.presenter.model.Cat;

public interface IMainViewAction extends BaseViewAction {
    void showCatsName(Cat cat);
}
