package com.example.login_sharedpref;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    SessionM sessionM;
   // TextView prof_textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        sessionM = new SessionM(getApplicationContext());
     //   prof_textView = (TextView) findViewById(R.id.prof_textView);

      String name=  sessionM.getSessionDeatils("your_name");
     //   prof_textView.setText(name);
    }

    public void logout(View view){
        sessionM.logout();
    }
}