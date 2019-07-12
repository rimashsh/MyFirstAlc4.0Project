package com.cook.bio.myfirstalcproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
Button about;
Button myprofile;
TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        about= findViewById(R.id.about);
        myprofile= findViewById(R.id.profile);
        txt=findViewById(R.id.textView);
        about.setOnClickListener(this);
        myprofile.setOnClickListener(this);
        txt.animate().rotationX(20);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.about:
                startActivity(new Intent(MainActivity.this,AboutAlcActivity.class));
                break;

            case R.id.profile:
                startActivity(new Intent(MainActivity.this,MyProfileActivity.class));
                break;

            default:
                break;
        }

    }
}
