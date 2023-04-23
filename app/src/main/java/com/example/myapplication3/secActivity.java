package com.example.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class secActivity extends AppCompatActivity implements View.OnClickListener {

    Button button;
    String user,passd;
    TextView welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
        button = findViewById(R.id.button1);


        button.setOnClickListener(this);

        Intent extras = getIntent();
        user = extras.getStringExtra("username");
        passd = extras.getStringExtra("password");
        welcome = findViewById(R.id.welcome);
        welcome.setText(welcome.getText().toString()+user);
    }


    @Override
    public void onClick(View view) {

        Intent intent = new Intent(secActivity.this, MainActivity.class);
        this.startActivity(intent);
    }
}