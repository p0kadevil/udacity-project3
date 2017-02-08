package com.example.cebert.myapplication.webservice;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import java.util.Random;


@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "webservice.myapplication.cebert.example.com",
                ownerName = "webservice.myapplication.cebert.example.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    @ApiMethod(name = "getRandomJoke")
    public Joke getRandomJoke() {

        return new Joke(com.example.Joke.getRandomJoke());
    }

}
