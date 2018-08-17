package com.example.cozart.cvapp;

import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MeActivity extends Fragment {

    public String phone;
    public TextView phoneNumber;
    public TextView textMail;
    public String mail;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootview = inflater.inflate(R.layout.activity_me, container, false);

        phoneNumber = (TextView) rootview.findViewById(R.id.text_phone);
        textMail = (TextView) rootview.findViewById(R.id.text_mail);

        phone = "tel:" + phoneNumber.getText().toString();
        mail = "mailto:" +textMail.getText().toString();

        onPressPhone();
        onPressMail();


        return rootview;
    }


    @SuppressLint("ClickableViewAccessibility")
    private void onPressPhone(){
        phoneNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse(phone));
                startActivity(callIntent);
            }
        });
        phoneNumber.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        phoneNumber.setAlpha(0.5f);
                        break;
                    }
                    case MotionEvent.ACTION_UP:
                    case MotionEvent.ACTION_CANCEL: {
                        phoneNumber.setAlpha(1f);
                        break;
                    }
                }
                return false;
            }
        });
    }

    @SuppressLint("ClickableViewAccessibility")
    private void onPressMail(){
        textMail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse(mail));
                try {
                    startActivity(emailIntent);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(getActivity()
                            ,"Aucune application de type mail n'est présente sur votre téléphone"
                            , Toast.LENGTH_LONG).show();
                }
            }
        });
        textMail.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN: {
                        textMail.setAlpha(0.5f);
                        break;
                    }
                    case MotionEvent.ACTION_UP:
                    case MotionEvent.ACTION_CANCEL: {
                        textMail.setAlpha(1f);
                        break;
                    }
                }
                return false;
            }
        });
    }
}
