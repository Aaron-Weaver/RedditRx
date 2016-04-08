package com.appweava.redditrx.domain;

import android.support.annotation.NonNull;

import com.appweava.redditrx.Subreddit;
import com.appweava.redditrx.domain.entities.SubredditModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weava on 4/7/16.
 */
public class SubredditConverter implements Converter<Subreddit, SubredditModel> {

    @Override
    public SubredditModel convert(@NonNull Subreddit itemToConvert) {
        if (itemToConvert != null) {
            SubredditModel convertSubreddit = new SubredditModel();

            convertSubreddit.setBannerImageUrl(itemToConvert.getBannerImg());
            convertSubreddit.setId(itemToConvert.getId());
            convertSubreddit.setDisplayName(itemToConvert.getDisplayName());
            convertSubreddit.setTitle(itemToConvert.getTitle());
            convertSubreddit.setNSFW(itemToConvert.getOver18());
            convertSubreddit.setHeaderTitle(itemToConvert.getHeaderTitle());
            convertSubreddit.setDescription(itemToConvert.getDescription());
            convertSubreddit.setNumSubs(itemToConvert.getSubscribers());
            convertSubreddit.setKeyColor(itemToConvert.getKeyColor());
            convertSubreddit.setName(itemToConvert.getName());
            convertSubreddit.setUrl(itemToConvert.getUrl());
            convertSubreddit.setPublicDescription(itemToConvert.getUrl());
            convertSubreddit.setSubredditType(itemToConvert.getSubredditType());
            convertSubreddit.setHeaderImage(itemToConvert.getHeaderImg());
            convertSubreddit.setIconImage(itemToConvert.getIconImg());

            return convertSubreddit;
        }
        else {
            return null;
        }
    }

    @Override
    public List<SubredditModel> convert(@NonNull List<Subreddit> itemsToConvert) {

        if(!itemsToConvert.isEmpty()) {
            List<SubredditModel> subredditDomainList = new ArrayList<>();

            for(Subreddit item : itemsToConvert) {
                subredditDomainList.add(convert(item));
            }

            return subredditDomainList;
        } else {
            return null;
        }
    }
}
