package com.appweava.redditrx.presentation.fragments;

import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.appweava.redditrx.R;

import butterknife.Bind;

/**
 * Created by weava on 3/30/16.
 */
public abstract class BaseRecyclerFragment extends BaseFragment {

    @Bind(R.id.recycler_view)
    protected RecyclerView mRecyclerView;

    protected GridLayoutManager mGridLayoutManager;

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.base_fragment_recycler;
    }

    protected void initList(RecyclerView.Adapter adapter, int numCols) {
        mGridLayoutManager = new GridLayoutManager(mRecyclerView.getContext(), numCols);
        mRecyclerView.setLayoutManager(mGridLayoutManager);
        mRecyclerView.setAdapter(adapter);
    }

    protected void replaceViewWithError(@StringRes String message, @DrawableRes int errorIcon) {
        // Show error view
    }
}
