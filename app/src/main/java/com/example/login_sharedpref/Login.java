package com.example.login_sharedpref;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    EditText log_mail, log_pass;
    SessionM sessionM;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        sessionM =new SessionM(getApplicationContext());

        log_mail = (EditText) findViewById(R.id.log_mail);
        log_pass = (EditText) findViewById(R.id.log_pass);
    }

    public void login(View view){
        String email = log_mail.getText().toString();
        String password = log_pass.getText().toString();

        if(email.equals("priyanka@gmail.com") && password.equals("79211")){

            sessionM.createSessionM("Priyanka", "priyanka@gmail.com", "79211");
            Intent i = new Intent(getApplicationContext(),Profile.class);
            startActivity(i);
        }
        else{
            Toast.makeText(this,"Emailid or password not matched",Toast.LENGTH_SHORT).show();
        }

    }

    public void registerhere(View view){

        Intent i = new Intent(getApplicationContext(),Register.class);
        startActivity(i);

    }
}