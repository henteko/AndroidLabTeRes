package com.henteko07.androidlabteressampleapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;



public class FirstActivity extends Activity implements UserFragment.OnNextBtnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            UserFragment mainFragment = new UserFragment();

            Bundle bundle = new Bundle();
            bundle.putInt(UserFragment.NUMBER_KEY, 1);
            bundle.putString(UserFragment.BUTTON_TEXT_KEY, "次へ");
            mainFragment.setArguments(bundle);

            getFragmentManager().beginTransaction()
                    .add(R.id.container, mainFragment)
                    .commit();
        }
    }

    @Override
    public void onNextClicked(User user) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(User.USER_KEY, user);
        startActivity(intent);
    }
}
