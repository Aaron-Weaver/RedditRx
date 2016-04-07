package com.appweava.redditrx.presentation.fragments;

import android.os.Bundle;
import android.view.View;

import com.appweava.redditrx.RedditRxApplication;
import com.appweava.redditrx.data.rest.RedditApi;
import com.appweava.redditrx.data.rx.RxCallback;
import com.appweava.redditrx.data.rx.SubredditRxSubscriber;
import com.appweava.redditrx.domain.entities.SubredditDomain;
import com.appweava.redditrx.presentation.adapters.SubredditAdapter;

import java.util.List;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import timber.log.Timber;

/**
 * Created by weava on 3/30/16.
 */
public class SubredditFragment extends BaseRecyclerFragment implements RxCallback<List<SubredditDomain>> {

    private static final String TAG = "Subreddit Fragment";

    private SubredditAdapter mSubredditAdapter;
    private RedditApi mRedditApi;

    public static SubredditFragment newInstance() {
        SubredditFragment fragment = new SubredditFragment();
        return fragment;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRedditApi = RedditRxApplication.getInstance().getRedditApi();
        mSubredditAdapter = new SubredditAdapter(getActivity());
        initList(mSubredditAdapter, 1);
        queryData();
    }

    private void queryData() {
        mRedditApi.getSubredditsList()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new SubredditRxSubscriber(this));
    }

    @Override
    public void onDataReady(List<SubredditDomain> data) {
        if (!data.isEmpty()) {
            mSubredditAdapter.add(data);
        }
    }

    @Override
    public void onDataError(Throwable e) {
        Timber.tag(TAG).d("Message: %s | StackTrace: %s", e.getMessage(), e.getStackTrace());
    }
}
