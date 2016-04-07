package com.appweava.redditrx.presentation.adapters;

import android.content.Context;
import android.view.View;

import com.appweava.redditrx.R;
import com.appweava.redditrx.domain.entities.SubredditDomain;
import com.appweava.redditrx.presentation.viewHolders.BaseViewHolder;
import com.appweava.redditrx.presentation.viewHolders.SubredditViewHolder;

/**
 * Created by weava on 4/7/16.
 */
public class SubredditAdapter extends BaseRecyclerAdapter<SubredditDomain> {

    private Context mContext;

    public SubredditAdapter(Context context) {
        mContext = context;
    }

    @Override
    public int getLayoutRes() {
        return R.layout.card_subreddit;
    }

    @Override
    public BaseViewHolder<SubredditDomain> inflateViewHolder(View view) {
        return new SubredditViewHolder(view, mContext);
    }
}
