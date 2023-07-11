package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { //시작점 = main 함수
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void exButtonClicked(View v){ //ExButton 클릭했을 경우
        Toast.makeText(this, "ExButton Clicked!", Toast.LENGTH_LONG).show();
    }

    public void googleButtonClicked(View v){ //ConntectToGoogle 클릭했을 경우
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"));
        startActivity(myIntent);
    }

    public void phoneCallButtonClicked(View v){ //PhoneCall 클릭했을 경우
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-0000-0000"));
        startActivity(myIntent);
    }
}