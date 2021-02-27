package com.example.transferdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView textView1,textView2;
    SharedPreferences sharedPreferences;

    private static final String SHARED_PREF_NAME="mypref";
    private static final String KEY_NAME="name";
    private static final String KEY_PASSWORD="password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        textView1=findViewById(R.id.textView11);
        textView2=findViewById(R.id.textView22);
        setContentView(R.layout.activity_main3);
        sharedPreferences=getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);
String name=sharedPreferences.getString(KEY_NAME,null);
String password=sharedPreferences.getString(KEY_PASSWORD,null);

/*if(name!=null ||password!=null)
{
    textView1.setText("name"+name);
    textView2.setText("password"+password);
}*/
    }
}