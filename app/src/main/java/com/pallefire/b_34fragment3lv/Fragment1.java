package com.pallefire.b_34fragment3lv;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {
    ListView listView;
    String[] cities={"Bangalore","Delhi","Hyderabad","Mumbai","Pune"};
    ArrayAdapter<String> arrayAdapter;


    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.first_fragment, container, false);
        listView = (ListView) v.findViewById(R.id.listView1);
        arrayAdapter = new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,cities);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //2.use getActivity() in listview in click listner
                MainActivity m = (MainActivity) getActivity();
                //3:pass data to method of activity 1-with appropriate city name
                m.passData(cities[position]);
            }
        });
        return v;
    }

}
