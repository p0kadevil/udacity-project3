package com.example;

import java.util.Random;

public class Joke {

    public static String getRandomJoke() {

        String[] randomJokeArray = new String[]{"This is a bad joke.",
                "This is a bad joke 2.",
                "This is a bad joke 3.",
                "This is a bad joke 4.",
                "This is a bad joke 5.",
                "This is a bad joke 6.",
                "This is a bad joke 7.",
                "This is a bad joke 8.",
                "This is a bad joke 9.",
                "This is a bad joke 10."};

        return randomJokeArray[(new Random()).nextInt(9)];
    }
}
