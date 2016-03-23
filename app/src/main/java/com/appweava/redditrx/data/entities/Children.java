package com.appweava.redditrx.data.entities;

import com.appweava.redditrx.Subreddit;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by weava on 3/22/16.
 */
public class Children {

    @SerializedName("kind")
    @Expose
    private String kind;

    @SerializedName("data")
    @Expose
    private Subreddit mSubreddit;

    public Subreddit getSubreddit() {
        return mSubreddit;
    }

    public void setSubreddit(Subreddit subreddits) {
        mSubreddit = subreddits;
    }
}
