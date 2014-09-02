package com.henteko07.androidlabteressampleapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by kenta.imai on 2014/09/02.
 */
public class MainFragment extends Fragment {
    public static final String NUMBER_KEY = "number";

    private TextView mTextView;
    private EditText mNameEditText;
    private Spinner mBloodSpinner;
    private String mCurrentBlood;
    private Button mNextButton;

    public MainFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        mTextView = (TextView) rootView.findViewById(R.id.textView);
        mNameEditText = (EditText) rootView.findViewById(R.id.nameEditText);
        mBloodSpinner = (Spinner) rootView.findViewById(R.id.bloodSpinner);
        mNextButton = (Button) rootView.findViewById(R.id.nextButton);

        int number = getArguments().getInt(NUMBER_KEY);
        setNumberTextView(number);

        setBloodSpinner();

        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ここで次のActivityに行くかFragmentを表示する
                // まぁまずはMainActivityに通知するのが先かな
            }
        });

        return rootView;
    }

    private void setNumberTextView(int number) {
        mTextView.setText(String.format("%d人目の情報を入力してください", number));
    }

    private void setBloodSpinner() {
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        adapter.add("A");
        adapter.add("B");
        adapter.add("O");
        adapter.add("AB");

        mCurrentBlood = adapter.getItem(0);

        mBloodSpinner.setAdapter(adapter);
        mBloodSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                Spinner spinner = (Spinner) parent;
                String item = (String) spinner.getSelectedItem();
                mCurrentBlood = item;
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });
    }
}
