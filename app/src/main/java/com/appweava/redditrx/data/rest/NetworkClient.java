package com.appweava.redditrx.data.rest;

import android.content.Context;

import com.facebook.stetho.okhttp3.StethoInterceptor;

import okhttp3.OkHttpClient;

/**
 * Created by weava on 3/22/16.
 */
public class NetworkClient {

    private static OkHttpClient initOkHttpClient(Context context) {

        OkHttpClient client = new OkHttpClient().newBuilder()
                .addNetworkInterceptor(new StethoInterceptor())
                .build();

        return client;
    }

    public static OkHttpClient getOkClient(Context context) {
        return initOkHttpClient(context);
    }
}
