package com.henteko07.androidlabteressampleapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;



public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            final Activity self = this;
            MainFragment mainFragment = new MainFragment();
            mainFragment.setOnNextBtnClickListener(new MainFragment.OnNextBtnClickListener() {
                @Override
                public void onNextClicked(User user) {
                    Intent intent = new Intent(self,SecondActivity.class);
                    intent.putExtra(User.USER_KEY, user);
                    startActivity(intent);
                }
            });

            Bundle bundle = new Bundle();
            bundle.putInt(MainFragment.NUMBER_KEY, 1);
            bundle.putString(MainFragment.BUTTON_TEXT_KEY, "次へ");
            mainFragment.setArguments(bundle);

            getFragmentManager().beginTransaction()
                    .add(R.id.container, mainFragment)
                    .commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
