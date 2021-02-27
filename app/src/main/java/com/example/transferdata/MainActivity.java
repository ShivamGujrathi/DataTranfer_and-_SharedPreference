package com.example.transferdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText firstname,lastname;
 Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstname=findViewById(R.id.firstname);
        lastname=findViewById(R.id.lastname);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
  button2.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View view) {
         Intent intent=new Intent(MainActivity.this,MainActivity2.class);
         startActivity(intent);
         Toast.makeText(MainActivity.this,"login Success",Toast.LENGTH_SHORT).show();
     }
 });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usrename=firstname.getText().toString();
                String surname=lastname.getText().toString();
                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("keyname",firstname.getText().toString());
                intent.putExtra("keysurname",lastname.getText().toString());
                startActivity(intent);
                Toast.makeText(MainActivity.this,"login Success",Toast.LENGTH_SHORT).show();
            }
        });
    }
}