package com.example.login_sharedpref;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

public class SessionM {
    Context context;
    SharedPreferences sp;
    SharedPreferences.Editor editor;
    private final String DEMO_FILE="File_info";

    private final String ALREADY_LOGIN ="logged_in_session";
    private final String KEY_NAME="your_name";
    private final String KEY_EMAIL="your_mail";
    private final String KEY_PHONE="your_number";

    public SessionM(Context context){
         this.context =context ;
        sp = context.getSharedPreferences("DEMO_FILE",0);
        editor=sp.edit();
    }

    public boolean checkSessionM(){
        if(sp.contains(ALREADY_LOGIN)){
            return true;
        }
        else
        {
            return false;
        }

    }
    public void createSessionM (String name, String mail, String ph){

        editor.putString(KEY_NAME,name);
        editor.putString(KEY_EMAIL,mail);
        editor.putString(KEY_PHONE,ph);
        editor.putBoolean(ALREADY_LOGIN,true);
        editor.commit();

    }

    public String getSessionDeatils(String key){
       String value= sp.getString(key,null);
       return value;

    }
    public void logout(){
        editor.clear();
        editor.commit();

        Intent i = new Intent(context, Login.class);
        context.startActivity(i);
    }
}
