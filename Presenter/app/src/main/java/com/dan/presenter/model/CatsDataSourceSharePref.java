package com.dan.presenter.model;

import android.content.Context;
import android.content.SharedPreferences;

public class CatsDataSourceSharePref implements ICatsDataSource {

    public static final String FILE_NAME = "shared_cats";
    public static final String NAME = "savedName";

    Context context;

    public CatsDataSourceSharePref(Context context) {
        this.context = context;
    }

    @Override
    public Cat getCat() {
        SharedPreferences sharedPreferences = context.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        return new Cat(sharedPreferences.getString(NAME, "Barsic"));
    }

    @Override
    public void saveCat(Cat cat) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(NAME, cat.name);
        editor.apply();
    }
}
