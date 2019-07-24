package com.example.academysix;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Tab2 extends Fragment
{
    TextView textView;
    Button submit;

    @Override
    public View onCreateView(@NonNull final LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View v = inflater.inflate(R.layout.tab2, container, false);
        textView = v.findViewById(R.id.textviewtab1);
        submit = v.findViewById(R.id.btntwo);

        submit.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getContext(),FinalActivity.class);
                intent.putExtra("", textView.getText().toString());
                startActivity(intent);
            }
        });
        return v;
    }

    @SuppressLint("SetTextI18n")
    public void displayReceivedData(String message)
    {
        textView.setText("" +message);
    }
}