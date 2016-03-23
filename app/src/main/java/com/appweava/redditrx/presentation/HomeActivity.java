package com.appweava.redditrx.presentation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.appweava.redditrx.R;
import com.appweava.redditrx.RedditRxApplication;
import com.appweava.redditrx.Subreddit;
import com.appweava.redditrx.data.rx.RxCallback;
import com.appweava.redditrx.data.rx.SubredditRxSubscriber;

import java.util.List;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class HomeActivity extends AppCompatActivity implements RxCallback<List<Subreddit>> {

    private final String TAG = "HomeActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        RedditRxApplication.getInstance().getRedditApi().getSubredditsList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SubredditRxSubscriber(this));
    }

    @Override
    public void onDataReady(List<Subreddit> data) {
        for(Subreddit subreddit : data) {
            Log.i(TAG, subreddit.getDisplayName());
        }
    }

    @Override
    public void onDataError(Throwable e) {

    }
}
