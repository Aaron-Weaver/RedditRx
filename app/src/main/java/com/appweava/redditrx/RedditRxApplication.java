package com.appweava.redditrx;

import android.app.Application;

import com.appweava.redditrx.data.rest.RedditApi;
import com.appweava.redditrx.data.rest.RedditClient;

/**
 * Created by weava on 3/22/16.
 */
public class RedditRxApplication extends Application{

    private static RedditRxApplication mInstance;

    private RedditApi mRedditApi;

    @Override
    public void onCreate() {
        super.onCreate();

        mInstance = this;
    }

    public static RedditRxApplication getInstance() {
        return mInstance;
    }

    public RedditApi getRedditApi() {
        if(mRedditApi == null) {
            mRedditApi = RedditClient.initApi(this);
        }
        return mRedditApi;
    }
}
