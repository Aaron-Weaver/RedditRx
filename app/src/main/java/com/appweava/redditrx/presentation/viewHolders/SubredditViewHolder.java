package com.appweava.redditrx.presentation.viewHolders;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.appweava.redditrx.R;
import com.appweava.redditrx.domain.entities.SubredditDomain;
import com.squareup.picasso.Picasso;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by weava on 4/7/16.
 */
public class SubredditViewHolder extends BaseViewHolder<SubredditDomain> {

    @Bind(R.id.subreddit_banner_image)
    protected ImageView mBannerImageView;

    @Bind(R.id.subreddit_name)
    protected TextView mNameTextView;

    @Bind(R.id.subreddit_description)
    protected TextView mDescriptionTextView;

    private Context mContext;

    public SubredditViewHolder(View itemView, Context context) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        this.mContext = context;
    }

    @Override
    public void bind(@NonNull SubredditDomain bindObject) {

        if(bindObject.getHeaderImage() != null) {
            if (!bindObject.getHeaderImage().isEmpty()) {
                Picasso.with(mContext)
                        .load(bindObject.getHeaderImage())
                        .placeholder(R.drawable.back_reddit_placeholder)
                        .fit()
                        .into(mBannerImageView);
            }
        }

        if(bindObject.getDisplayName() != null) {
            mNameTextView.setText("r/" + bindObject.getDisplayName());
        } else {
            mNameTextView.setText("");
        }

        if(bindObject.getDescription() != null) {
            mDescriptionTextView.setText(bindObject.getDescription());
        } else {
            mDescriptionTextView.setText("");
        }
    }
}
