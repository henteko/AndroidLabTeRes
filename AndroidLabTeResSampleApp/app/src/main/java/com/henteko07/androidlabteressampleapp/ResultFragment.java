package com.henteko07.androidlabteressampleapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by kenta.imai on 2014/09/02.
 */
public class ResultFragment extends Fragment {
    public static final String RESULT_KEY = "result";

    public ResultFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_result, container, false);

        Divination divination = (Divination) getArguments().getSerializable(RESULT_KEY);

        TextView textView = (TextView) rootView.findViewById(R.id.textView);
        textView.setText(String.format("%sさんと%sさんの相性結果", divination.firstUser.name, divination.secondUser.name));

        TextView compatibilityTextView = (TextView) rootView.findViewById(R.id.compatibilityTextView);
        compatibilityTextView.setText(String.format("%s ％の相性です", divination.compatibility));

        TextView resultTextView = (TextView) rootView.findViewById(R.id.resultTextView);
        resultTextView.setText(divination.result);

        return rootView;
    }
}
