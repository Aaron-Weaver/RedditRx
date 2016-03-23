package com.appweava.redditrx.data.rest;

import android.app.Application;

import com.appweava.redditrx.data.SubredditDeserializer;
import com.appweava.redditrx.data.entities.SubredditResult;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by weava on 3/22/16.
 */
public class RedditClient {

    public static final String API_BASE_URL = "https://www.reddit.com";

    public static RedditApi initApi(Application app) {

        Gson gson =
                new GsonBuilder().registerTypeAdapter(SubredditResult.class, new SubredditDeserializer()).create();

        return new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .client(NetworkClient.getOkClient(app))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build().create(RedditApi.class);

    }
}
