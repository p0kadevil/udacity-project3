package com.p0kadevil.joketellingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.ads.MobileAds;
import com.p0kadevil.jokeandroidlib.ViewJokeActivity;


public class MainActivity extends AppCompatActivity implements JokeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new EndpointsAsyncTask(this, this).execute(this);
    }

    @Override
    public void jokeLoaded(String joke) {

        Intent viewJokeIntent = new Intent(this, ViewJokeActivity.class);
        viewJokeIntent.putExtra(ViewJokeActivity.INTENT_JOKE, joke);
        startActivity(viewJokeIntent);

        MobileAds.initialize(getApplicationContext(), "ca-app-pub-3940256099942544~3347511713");
    }
}

