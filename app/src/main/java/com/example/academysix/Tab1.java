package com.example.academysix;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Tab1 extends Fragment
{
    SendMessage message;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View v=inflater.inflate(R.layout.tab1, container, false);

        final EditText editone = v.findViewById(R.id.edttext1);
        Button btnone = v.findViewById(R.id.f1);

        btnone.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) { message.sendData(editone.getText().toString().trim()); }
        });
        return v;
    }

    interface SendMessage { void sendData(String message);}

    public void onAttach(Context context)
    {
        super.onAttach(context);
        message = (SendMessage) getActivity();
    }
}