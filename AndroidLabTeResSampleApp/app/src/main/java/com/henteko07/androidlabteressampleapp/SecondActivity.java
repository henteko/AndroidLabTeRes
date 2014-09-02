package com.henteko07.androidlabteressampleapp;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by kenta.imai on 2014/09/02.
 */
public class SecondActivity extends Activity {
    private User mFirstUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirstUser = (User) getIntent().getSerializableExtra(User.USER_KEY);

        if (savedInstanceState == null) {
            final Activity self = this;
            MainFragment mainFragment = new MainFragment();
            mainFragment.setOnNextBtnClickListener(new MainFragment.OnNextBtnClickListener() {
                @Override
                public void onNextClicked(User user) {
                    Log.d("#########################################", mFirstUser.name + " " + mFirstUser.blood.toString());
                    Log.d("#########################################", user.name + " " + user.blood.toString());
                }
            });

            Bundle bundle = new Bundle();
            bundle.putInt(MainFragment.NUMBER_KEY, 2);
            bundle.putString(MainFragment.BUTTON_TEXT_KEY, "占う");
            mainFragment.setArguments(bundle);

            getFragmentManager().beginTransaction()
                    .add(R.id.container, mainFragment)
                    .commit();
        }
    }
}
