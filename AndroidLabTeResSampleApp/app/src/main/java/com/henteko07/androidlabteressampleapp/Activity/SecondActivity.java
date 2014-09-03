package com.henteko07.androidlabteressampleapp.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.henteko07.androidlabteressampleapp.R;
import com.henteko07.androidlabteressampleapp.Model.User;
import com.henteko07.androidlabteressampleapp.Fragment.UserFragment;

/**
 * Created by kenta.imai on 2014/09/02.
 */
public class SecondActivity extends Activity implements UserFragment.OnNextBtnClickListener {
    private User mFirstUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mFirstUser = (User) getIntent().getSerializableExtra(User.USER_KEY);

        if (savedInstanceState == null) {
            UserFragment mainFragment = new UserFragment();

            Bundle bundle = new Bundle();
            bundle.putInt(UserFragment.NUMBER_KEY, 2);
            bundle.putString(UserFragment.BUTTON_TEXT_KEY, "占う");
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
