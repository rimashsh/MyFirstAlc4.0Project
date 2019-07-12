package com.cook.bio.myfirstalcproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MyProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        assert getSupportActionBar() != null;   //null check
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }


    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
