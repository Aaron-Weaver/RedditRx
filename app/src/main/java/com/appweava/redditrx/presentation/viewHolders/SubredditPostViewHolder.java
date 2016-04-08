package com.appweava.redditrx.presentation.viewHolders;

import android.support.annotation.NonNull;
import android.view.View;

import com.appweava.redditrx.domain.entities.PostModel;

/**
 * Created by weava on 4/7/16.
 */
public class SubredditPostViewHolder extends BaseViewHolder<PostModel> {

    private PostModel mPostModel;

    public SubredditPostViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void bind(@NonNull PostModel bindObject) {
        mPostModel = bindObject;
    }
}
