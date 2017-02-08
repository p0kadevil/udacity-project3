package com.example.cebert.myapplication.webservice;

/**
 * Created by cebert on 08.02.17.
 */

public class Joke {

    public String jokeContent;

    public Joke(String jokeText)
    {
        jokeContent = jokeText;
    }

    public String getData() {
        return jokeContent;
    }
}
