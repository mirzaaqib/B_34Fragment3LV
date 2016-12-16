package com.pallefire.b_34fragment3lv;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //read city name coming from first activity
        Intent intent=getIntent();
        Bundle bundle= intent.getExtras();
        String city= bundle.getString("city");
        //code for fragment
        FragmentManager fragmentManager=  getSupportFragmentManager();
        Fragment2 frag= (Fragment2) fragmentManager.findFragmentById(R.id.frag2);
        if(frag!=null){
            frag.catchData(city);
        }
    }
}
