package com.example.academysix;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static android.support.v7.widget.AppCompatDrawableManager.get;

public class FinalActivity extends AppCompatActivity
{
    TextView finaltext;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);
        finaltext = findViewById(R.id.finaltext);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        if(bundle != null)
        {
            String text= (String) bundle.get("");
            finaltext.setText(text);
        }
    }
}
