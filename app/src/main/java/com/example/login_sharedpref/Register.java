package com.example.login_sharedpref;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    SessionM sessionM;
    EditText reg_name, reg_pass, reg_mail, reg_phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        sessionM = new SessionM(getApplicationContext());
        reg_name = (EditText)findViewById(R.id.reg_name);
        reg_mail = (EditText)findViewById(R.id.reg_mail);
        reg_pass = (EditText)findViewById(R.id.reg_pass);
        reg_phone = (EditText)findViewById(R.id.reg_phone);

    }

    public void register(View view){

        String name = reg_name.getText().toString();
        String mail = reg_mail.getText().toString();
        String pass = reg_pass.getText().toString();
        String phone = reg_phone.getText().toString();

        //insert into database(mysql)
        sessionM.createSessionM(name,mail,phone);

        Intent i = new Intent(this, Profile.class);
        startActivity(i);
    }

    public void loginhere(View view){
        Intent i = new Intent(getApplicationContext(), Login.class);
        startActivity(i);
    }
}