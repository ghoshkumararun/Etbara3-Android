package com.example.karim.etbara3;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Karim on 7/3/2016.
 */
public class Fragment2 extends Fragment {
    TextView textView;
    View rootView;
    public Fragment2() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment2, container, false);
        MainActivity.flag = true;
        return rootView;
    }
}
