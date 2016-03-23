package com.appweava.redditrx.data.rest;

import com.appweava.redditrx.data.entities.SubredditResult;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by weava on 3/22/16.
 */
public interface RedditApi {

    @GET("subreddits.json")
    Observable<SubredditResult> getSubredditsList();
}
