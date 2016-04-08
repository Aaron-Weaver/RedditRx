package com.appweava.redditrx.presentation.adapters;

import android.view.View;

import com.appweava.redditrx.R;
import com.appweava.redditrx.domain.entities.PostModel;
import com.appweava.redditrx.presentation.viewHolders.BaseViewHolder;

/**
 * Created by weava on 4/7/16.
 */
public class SubredditPostAdapter extends BaseRecyclerAdapter<PostModel> {

    @Override
    public int getLayoutRes() {
        return R.layout.card_post;
    }

    @Override
    public BaseViewHolder<PostModel> inflateViewHolder(View view) {
        return null;
    }
}
