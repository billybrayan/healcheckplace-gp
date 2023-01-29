package com.example.healcheckplace;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AboutUs extends AppCompatActivity {
    
    TextView linkTextView;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);
        
       
        
        linkTextView = findViewById(R.id.linkgit);
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());

    }
}
