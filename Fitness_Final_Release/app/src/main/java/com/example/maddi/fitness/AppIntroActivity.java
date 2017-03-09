package com.example.maddi.fitness;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;

/**
 * Created by maddi on 4/23/2016.
 */
public class AppIntroActivity extends AppIntro {


    // Please DO NOT override onCreate. Use init.
    @Override
    public void init(Bundle savedInstanceState) {
        // Instead of fragments, you can also use our default slide
        // Just set a title, description, background and image. AppIntro will do the rest.
        addSlide(AppIntroFragment.newInstance("Eye Catching Visuals", "Your Daily Statistics", R.drawable.appintro1, getResources().getColor(R.color.appintro1)));
        //addSlide(AppIntroFragment.newInstance("Who is the best?", "Compare with Friends", R.drawable.appintro5, getResources().getColor(R.color.appintro2)));
        addSlide(AppIntroFragment.newInstance("Invite Friends", "Share A Run with them", R.drawable.appintro3, getResources().getColor(R.color.appintro3)));
        addSlide(AppIntroFragment.newInstance("", "Get Started", R.drawable.appintro4, getResources().getColor(R.color.appintro4)));

        // OPTIONAL METHODS
        // Override bar/separator color.
        setBarColor(Color.parseColor("#F44336"));
        setSeparatorColor(Color.parseColor("#2196F3"));

        // Hide Skip/Done button.
        showSkipButton(true);
        setProgressButtonEnabled(true);

        // Turn vibration on and set intensity.
        // NOTE: you will probably need to ask VIBRATE permisssion in Manifest.
        setVibrate(true);
        setVibrateIntensity(30);
    }

    @Override
    public void onSkipPressed() {
        // Do something when users tap on Skip button.
        Intent i = new Intent(AppIntroActivity.this, EnterInfoActivity.class);
        startActivity(i);
    }

    @Override
    public void onDonePressed() {
        // Do something when users tap on Done button.
        Intent i = new Intent(AppIntroActivity.this, EnterInfoActivity.class);
        startActivity(i);

        Toast.makeText(getApplicationContext(), "Finished", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSlideChanged() {
        // Do something when the slide changes.
    }

    @Override
    public void onNextPressed() {
        // Do something when users tap on Next button.
        Toast.makeText(getApplicationContext(), "Cannot Skip", Toast.LENGTH_SHORT).show();
    }

}