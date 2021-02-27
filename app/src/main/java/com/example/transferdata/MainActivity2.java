package com.example.transferdata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView textView1, textView2;
    EditText editText1, editText2;
    CheckBox checkBox;
    Button buttonR;
    SharedPreferences sharedPreferences;

    private static final String SHARED_PREF_NAME = "mypref";
    private static final String KEY_NAME = "name";
    private static final String KEY_PASSWORD = "password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editText1 = findViewById(R.id.editTextT1);
        editText2 = findViewById(R.id.editTextPassword);
        checkBox = findViewById(R.id.checkBox1);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        String username = getIntent().getStringExtra("keyname");
        String surname = getIntent().getStringExtra("keysurname");
        textView1.setText(username);
        textView2.setText(surname);
        buttonR = findViewById(R.id.buttonR);
        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME, MODE_PRIVATE);
        String name = sharedPreferences.getString(KEY_NAME, "");

        String password = sharedPreferences.getString(KEY_PASSWORD, "");
        if(!name.isEmpty()&& !password.isEmpty())
        {
            editText1.setText(name);
            editText2.setText(password);
        }
//        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
//
//            }
//        });



        buttonR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBox.isChecked()) {
//                    editText1.setText("name" + name1);
//                    editText1.setText("password" + password);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString(KEY_NAME, editText1.getText().toString());
                    editor.putString(KEY_PASSWORD, editText2.getText().toString());
                    editor.apply();
                    Intent Intent = new Intent(MainActivity2.this, MainActivity3.class);
                    startActivity(Intent);
                    Toast.makeText(MainActivity2.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
//                    editText1.setText("");
//                    editText1.setText("");
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putString(KEY_NAME, "");
                    editor.putString(KEY_PASSWORD, "");
                    editor.apply();
                    Intent Intent = new Intent(MainActivity2.this, MainActivity3.class);
                    startActivity(Intent);
                    Toast.makeText(MainActivity2.this, "correct", Toast.LENGTH_SHORT).show();
                }



            }
        });

    }
}