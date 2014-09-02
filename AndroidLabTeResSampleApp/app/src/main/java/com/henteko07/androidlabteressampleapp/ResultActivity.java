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

            // TODO: 名前とかも渡したいので、Divination自体を渡すようにする
            Bundle bundle = new Bundle();
            bundle.putString(ResultFragment.RESULT_KEY, divination.result);
            bundle.putDouble(ResultFragment.COMPATIBILITY_KEY, divination.compatibility);
            resultFragment.setArguments(bundle);

            getFragmentManager().beginTransaction()
                    .add(R.id.container, resultFragment)
                    .commit();
        }
    }
}
