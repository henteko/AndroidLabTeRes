package com.henteko07.androidlabteressampleapp.Fragment;

import android.app.Activity;
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

import com.henteko07.androidlabteressampleapp.Model.Blood;
import com.henteko07.androidlabteressampleapp.Model.User;
import com.henteko07.androidlabteressampleapp.R;

import java.util.Arrays;
import java.util.List;

/**
 * Created by kenta.imai on 2014/09/02.
 */
public class UserFragment extends Fragment {
    public static final String NUMBER_KEY = "number";
    public static final String BUTTON_TEXT_KEY = "next_button_text";

    private OnNextBtnClickListener mListener;

    private TextView mTextView;
    private EditText mNameEditText;
    private Spinner mBloodSpinner;
    private Blood mCurrentBlood;
    private Button mNextButton;

    public UserFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_user, container, false);
        mTextView = (TextView) rootView.findViewById(R.id.textView);
        mNameEditText = (EditText) rootView.findViewById(R.id.nameEditText);
        mBloodSpinner = (Spinner) rootView.findViewById(R.id.bloodSpinner);
        mNextButton = (Button) rootView.findViewById(R.id.nextButton);

        int number = getArguments().getInt(NUMBER_KEY);
        String nextButtonText = getArguments().getString(BUTTON_TEXT_KEY);
        mNextButton.setText(nextButtonText);

        setNumberTextView(number);
        setBloodSpinner();

        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mNameEditText.getText().toString();
                if (name.isEmpty()) return;

                User user = new User(name, mCurrentBlood);
                if (mListener != null) {
                    mListener.onNextClicked(user);
                }
            }
        });

        return rootView;
    }

    private void setNumberTextView(int number) {
        mTextView.setText(String.format("%d人目の情報を入力してください", number));
    }

    private void setBloodSpinner() {
        List<Blood> bloodList = Arrays.asList(Blood.values());
        mCurrentBlood = Blood.valueOf(Blood.A.toString());

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        for (Blood blood : bloodList) {
            adapter.add(blood.toString());
        }

        mBloodSpinner.setAdapter(adapter);
        mBloodSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                Spinner spinner = (Spinner) parent;
                String item = (String) spinner.getSelectedItem();
                mCurrentBlood = Blood.valueOf(item);
            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }
        });
    }

    public interface OnNextBtnClickListener {
        public void onNextClicked(User user);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if(activity instanceof OnNextBtnClickListener == false) {
            throw new ClassCastException("Activity not implements OnNextBtnClickListener.");
        }
        mListener = (OnNextBtnClickListener)activity;
    }
}
