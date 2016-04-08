package com.appweava.redditrx.presentation.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.appweava.redditrx.R;
import com.appweava.redditrx.presentation.fragments.SubredditListFragment;

public class HomeActivity extends BaseActivity {

    SubredditListFragment mSubredditFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mSubredditFragment = SubredditListFragment.newInstance();
        addFragmentToContainer(mSubredditFragment, "SubredditsFragment");
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.base_activity_collapse_list;
    }
}
