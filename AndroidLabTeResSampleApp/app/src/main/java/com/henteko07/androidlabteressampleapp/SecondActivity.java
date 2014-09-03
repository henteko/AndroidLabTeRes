package com.henteko07.androidlabteressampleapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by kenta.imai on 2014/09/02.
 */
public class SecondActivity extends Activity implements MainFragment.OnNextBtnClickListener {
    private User mFirstUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirstUser = (User) getIntent().getSerializableExtra(User.USER_KEY);

        if (savedInstanceState == null) {
            MainFragment mainFragment = new MainFragment();

            Bundle bundle = new Bundle();
            bundle.putInt(MainFragment.NUMBER_KEY, 2);
            bundle.putString(MainFragment.BUTTON_TEXT_KEY, "占う");
            mainFragment.setArguments(bundle);

            getFragmentManager().beginTransaction()
                    .add(R.id.container, mainFragment)
                    .commit();
        }
    }

    @Override
    public void onNextClicked(User user) {
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra(User.USER_KEY, mFirstUser);
        intent.putExtra(User.SECOND_USER_KEY, user);
        startActivity(intent);
    }
}
