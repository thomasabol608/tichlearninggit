package com.example.tichlearngit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
public TextView mytext;
    public String myteststring;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mytext=findViewById(R.id.firstitem);
        myteststring=mytext.toString();
    }

}