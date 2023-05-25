package com.example.tichlearngit;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
public TextView mytext;
    public String myteststring;
    public String thetext="Whats going on here....";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mytext=findViewById(R.id.firstitem);
        mytext.setTextColor(Color.RED);
        mytext.setText(thetext);
        myteststring=mytext.toString();

    }

}