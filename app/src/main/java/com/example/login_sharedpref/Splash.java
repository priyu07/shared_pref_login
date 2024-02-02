package com.example.login_sharedpref;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        SessionM sessionM = new SessionM(getApplicationContext());
       boolean session= sessionM.checkSessionM();

        if(session==true){
            Intent i = new Intent(this, Profile.class);
            startActivity(i);
        }
        else
        {
            Intent i = new Intent(this, Login.class);
            startActivity(i);
        }
    }

}