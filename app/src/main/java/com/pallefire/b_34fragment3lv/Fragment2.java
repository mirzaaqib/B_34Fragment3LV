package com.pallefire.b_34fragment3lv;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2 extends Fragment {
TextView textView;
    public void catchData(String city){
        textView.setText("you have clicked"+city);
    }

    public Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.second_fragment, container, false);
        textView = (TextView) v.findViewById(R.id.textView1);
        return v;
    }

}
