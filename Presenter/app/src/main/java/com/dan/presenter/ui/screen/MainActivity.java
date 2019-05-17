package com.dan.presenter.ui.screen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.dan.presenter.R;
import com.dan.presenter.model.Cat;
import com.dan.presenter.model.CatsDataSourceSharePref;
import com.dan.presenter.presenters.IMainViewAction;
import com.dan.presenter.presenters.MainPresenter;

public class MainActivity extends AppCompatActivity implements IMainViewAction{

    MainPresenter presenter;

    Button btnAction;
    Button btnNewCat;
    TextView resultTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        init();
    }

    private void init() {
        presenter = new MainPresenter(new CatsDataSourceSharePref(getApplicationContext()));
        presenter.setView(this);
    }

    private void initView() {
        btnAction = findViewById(R.id.btn_action);
        btnNewCat = findViewById(R.id.btn_create_new_cat);
        resultTxt = findViewById(R.id.txt_action);

        btnAction.setOnClickListener(v -> presenter.action());
        btnNewCat.setOnClickListener(v -> presenter.saveNewCat());
    }


    @Override
    public void showCatsName(Cat cat) {
        resultTxt.setText(cat.name);
    }
}
