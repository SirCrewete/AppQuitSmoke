package com.example.app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeActivityRegistrarse(View view) {
        Intent intentRegistrarse = new Intent(this, ActivityRegister.class);
        startActivity(intentRegistrarse);
    }

    public void intentTest(View view) {
        Intent intentTest = new Intent(this, ActivityRegister.class);
        startActivity(intentTest);
    }

    public void intentFacebook(View arg0){
        Intent facebookIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com"));
        startActivity(facebookIntent);
    }

    public void intentGoogle(View arg0){
        Intent googleIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://accounts.google.com/signin/v2/identifier?hl=es&passive=true&continue=https%3A%2F%2Fwww.google.es%2F&ec=GAZAAQ&flowName=GlifWebSignIn&flowEntry=ServiceLogin"));
        startActivity(googleIntent);
    }

    public void intentLinkedin(View arg0){
        Intent linkedinIntent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.linkedin.com"));
        startActivity(linkedinIntent);
    }

    public void intentTwitter (View arg0){
        Intent twitterIntent = new Intent (Intent.ACTION_VIEW,Uri.parse("https://mobile.twitter.com/?lang=es"));
        startActivity(twitterIntent);
    }




}