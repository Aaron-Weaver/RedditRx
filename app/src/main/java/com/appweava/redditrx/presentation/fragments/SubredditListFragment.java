package com.appweava.redditrx.presentation.fragments;

import android.os.Bundle;
import android.view.View;

import com.appweava.redditrx.RedditRxApplication;
import com.appweava.redditrx.data.rest.RedditApi;
import com.appweava.redditrx.data.rx.RxCallback;
import com.appweava.redditrx.data.rx.SubredditRxSubscriber;
import com.appweava.redditrx.domain.entities.SubredditModel;
import com.appweava.redditrx.presentation.ItemCallback;
import com.appweava.redditrx.presentation.adapters.SubredditListAdapter;

import java.util.List;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import timber.log.Timber;

/**
 * Created by weava on 3/30/16.
 */
public class SubredditListFragment extends BaseRecyclerFragment
        implements RxCallback<List<SubredditModel>>, ItemCallback<SubredditModel> {

    private static final String TAG = "Subreddit Fragment";

    private SubredditListAdapter mSubredditAdapter;
    private RedditApi mRedditApi;

    public static SubredditListFragment newInstance() {
        SubredditListFragment fragment = new SubredditListFragment();
        return fragment;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mRedditApi = RedditRxApplication.getInstance().getRedditApi();
        mSubredditAdapter = new SubredditListAdapter(getActivity(), this);
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
    public void onDataReady(List<SubredditModel> data) {
        if (!data.isEmpty()) {
            mSubredditAdapter.add(data);
        }
    }

    @Override
    public void onDataError(Throwable e) {
        Timber.tag(TAG).d("Message: %s | StackTrace: %s", e.getMessage(), e.getStackTrace());
    }

    @Override
    public void onClick(SubredditModel object) {
        // Activate subreddit stuff
    }
}
