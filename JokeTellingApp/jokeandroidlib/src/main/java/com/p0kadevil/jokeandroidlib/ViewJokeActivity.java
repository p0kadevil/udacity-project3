package com.p0kadevil.jokeandroidlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class ViewJokeActivity extends AppCompatActivity {

    public static final String INTENT_JOKE = "INTENT_JOKE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_joke);

        TextView text = (TextView) findViewById(R.id.tv_joke);
        text.setText(getIntent().getStringExtra(INTENT_JOKE));
    }
}
