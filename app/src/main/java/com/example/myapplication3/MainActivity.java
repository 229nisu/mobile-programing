package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import com.example.myapplication3.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    Button button2;

    EditText name,password;

    String user;
      String passd;



    public static String Btntext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Btntext = "next";
        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
       // setContentView(R.layout.activity_main);

       Button b1=findViewById(R.id.button2);
       b1.setOnClickListener(this);
       name= findViewById(R.id.editTextTextPersonName);
       name.setOnClickListener(this);
       password=findViewById(R.id.editTextTextPassword);
       password.setOnClickListener(this);
       button2 = findViewById(R.id.button2);
       button2.setOnClickListener(this);



    }

   @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.button2:
                user=name.getText().toString();
                passd=password.getText().toString();
                if(user.matches("ram")&&passd.matches("ram123"))
                {
                    Intent intent = new Intent(MainActivity.this, secActivity.class);
                    intent.putExtra("username",user);
                    intent.putExtra("password",passd);

                    this.startActivity(intent);
                }
                else
                    Toast.makeText(getApplicationContext(),"username/password invalid",Toast.LENGTH_LONG).show();
                break;
        };



    }
}