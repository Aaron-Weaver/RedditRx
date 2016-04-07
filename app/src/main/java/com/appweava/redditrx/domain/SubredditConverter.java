package com.appweava.redditrx.domain;

import android.support.annotation.NonNull;

import com.appweava.redditrx.Subreddit;
import com.appweava.redditrx.domain.entities.SubredditDomain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weava on 4/7/16.
 */
public class SubredditConverter implements Converter<Subreddit, SubredditDomain> {

    @Override
    public SubredditDomain convert(@NonNull Subreddit itemToConvert) {
        if (itemToConvert != null) {
            SubredditDomain convertSubreddit = new SubredditDomain();

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
    public List<SubredditDomain> convert(@NonNull List<Subreddit> itemsToConvert) {

        if(!itemsToConvert.isEmpty()) {
            List<SubredditDomain> subredditDomainList = new ArrayList<>();

            for(Subreddit item : itemsToConvert) {
                subredditDomainList.add(convert(item));
            }

            return subredditDomainList;
        } else {
            return null;
        }
    }
}
