package com.appweava.redditrx.presentation.viewHolders;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.TextView;

import com.appweava.redditrx.R;
import com.appweava.redditrx.domain.entities.SubredditModel;
import com.appweava.redditrx.presentation.ItemCallback;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by weava on 4/7/16.
 */
public class SubredditViewHolder extends BaseViewHolder<SubredditModel> {

    @Bind(R.id.subreddit_name)
    protected TextView mNameTextView;

    @Bind(R.id.subreddit_description)
    protected TextView mDescriptionTextView;

    private Context mContext;
    private ItemCallback<SubredditModel> mCallback;
    private SubredditModel mViewModel;

    public SubredditViewHolder(View itemView, Context context, ItemCallback<SubredditModel> callback) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        this.mContext = context;
        this.mCallback = callback;
    }

    @Override
    public void bind(@NonNull SubredditModel bindObject) {

        mViewModel = bindObject;

        if(bindObject.getDisplayName() != null) {
            mNameTextView.setText(String.format("/r/%s", bindObject.getDisplayName()));
        } else {
            mNameTextView.setText("");
        }

        if(bindObject.getDescription() != null) {
            mDescriptionTextView.setText(bindObject.getDescription());
        } else {
            mDescriptionTextView.setText("");
        }
    }

    @OnClick(R.id.subreddit_card)
    public void onClick(View v) {
        mCallback.onClick(mViewModel);
    }
}
