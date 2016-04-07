package com.appweava.redditrx.presentation.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.appweava.redditrx.R;
import com.appweava.redditrx.presentation.fragments.SubredditFragment;

public class HomeActivity extends BaseActivity {

    SubredditFragment mSubredditFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mSubredditFragment = SubredditFragment.newInstance();
        addFragmentToContainer(mSubredditFragment, "SubredditsFragment");
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.activity_home;
    }
}
