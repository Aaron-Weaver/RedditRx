package com.appweava.redditrx.presentation.activities;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;

import com.appweava.redditrx.R;

/**
 * Created by weava on 3/30/16.
 */
public abstract class BaseDrawerActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @LayoutRes
    protected int getLayoutRes() {
        return R.layout.activity_home;
    }
}
