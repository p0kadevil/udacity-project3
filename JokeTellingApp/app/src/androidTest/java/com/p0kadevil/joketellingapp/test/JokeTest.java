package com.p0kadevil.joketellingapp.test;

import android.test.AndroidTestCase;
import android.util.Log;
import com.p0kadevil.joketellingapp.EndpointsAsyncTask;
import com.p0kadevil.joketellingapp.JokeListener;

import java.util.concurrent.ExecutionException;

/**
 * Created by cebert on 08.02.17.
 */

public class JokeTest extends AndroidTestCase implements JokeListener {

    private static final String TAG = JokeTest.class.getSimpleName();

    EndpointsAsyncTask fetchJokeTask;

    public void testFetchesNonEmptyString()
    {
        fetchJokeTask = new EndpointsAsyncTask(getContext(), this);
        fetchJokeTask.execute(getContext());
    }

    @Override
    public void jokeLoaded(String joke) {

        assertNotNull(joke);
        assertTrue(joke.length() > 0);
    }
}
