package com.dan.presenter.model;

public interface ICatsDataSource {

    Cat getCat();
    
    void saveCat(Cat cat);
}
