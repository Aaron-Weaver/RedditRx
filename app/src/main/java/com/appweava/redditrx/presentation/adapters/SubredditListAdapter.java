package com.appweava.redditrx.presentation.adapters;

import android.content.Context;
import android.view.View;

import com.appweava.redditrx.R;
import com.appweava.redditrx.domain.entities.SubredditModel;
import com.appweava.redditrx.presentation.ItemCallback;
import com.appweava.redditrx.presentation.viewHolders.BaseViewHolder;
import com.appweava.redditrx.presentation.viewHolders.SubredditViewHolder;

/**
 * Created by weava on 4/7/16.
 */
public class SubredditListAdapter extends BaseRecyclerAdapter<SubredditModel> {

    private Context mContext;
    private ItemCallback<SubredditModel> mCallback;

    public SubredditListAdapter(Context context, ItemCallback<SubredditModel> callback) {
        mContext = context;
        mCallback = callback;
    }

    @Override
    public int getLayoutRes() {
        return R.layout.card_subreddit;
    }

    @Override
    public BaseViewHolder<SubredditModel> inflateViewHolder(View view) {
        return new SubredditViewHolder(view, mContext, mCallback);
    }
}
