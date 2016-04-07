package com.appweava.redditrx.presentation.activities;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.appweava.redditrx.R;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by weava on 3/30/16.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Bind(R.id.toolbar)
    protected Toolbar mToolbar;

    @Bind(R.id.container)
    protected FrameLayout mContainer;

    @Bind(R.id.collapsing_toolbar)
    protected CollapsingToolbarLayout mCollapsingToolbarLayout;

    protected FragmentManager mFragmentManager;
    protected boolean mIsBackNav = false;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutRes());
        ButterKnife.bind(this);

        if(mToolbar != null) {
            setSupportActionBar(mToolbar);
        }

        if(mFragmentManager == null) {
            mFragmentManager = getSupportFragmentManager();
        }
    }

    protected void addFragmentToContainer(Fragment fragment, String tag) {
        // Add fragment to base container
        if(mFragmentManager != null) {
            mFragmentManager.beginTransaction().replace(R.id.container, fragment, tag).commit();
        }
    }

    protected void enableBackNav() {
        if(getSupportActionBar() != null) {
            mIsBackNav = true;
            getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeButtonEnabled(true);
        }
    }

    public void setActivityTitle(@NonNull String title) {
        if(getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == android.R.id.home && mIsBackNav) {
            super.onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }

    @LayoutRes
    protected int getLayoutRes() {
        return R.layout.base_activity;
    }
}
