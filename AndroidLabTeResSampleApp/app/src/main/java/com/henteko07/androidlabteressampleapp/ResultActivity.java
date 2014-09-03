package com.henteko07.androidlabteressampleapp;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by kenta.imai on 2014/09/02.
 */
public class ResultActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User firstUser = (User) getIntent().getSerializableExtra(User.USER_KEY);
        User secondUser = (User) getIntent().getSerializableExtra(User.SECOND_USER_KEY);
        Divination divination = new Divination(firstUser, secondUser);

        if (savedInstanceState == null) {
            ResultFragment resultFragment = new ResultFragment();

            Bundle bundle = new Bundle();
            bundle.putSerializable(ResultFragment.RESULT_KEY, divination);
            resultFragment.setArguments(bundle);

            getFragmentManager().beginTransaction()
                    .add(R.id.container, resultFragment)
                    .commit();
        }
    }
}
