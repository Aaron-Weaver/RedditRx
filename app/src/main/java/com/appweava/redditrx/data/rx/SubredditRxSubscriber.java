package com.appweava.redditrx.data.rx;

import com.appweava.redditrx.Subreddit;
import com.appweava.redditrx.data.entities.Children;
import com.appweava.redditrx.data.entities.SubredditResult;
import com.appweava.redditrx.domain.Converter;
import com.appweava.redditrx.domain.SubredditConverter;
import com.appweava.redditrx.domain.entities.SubredditDomain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weava on 3/22/16.
 */
public class SubredditRxSubscriber extends ConverterRxSubscriber<SubredditResult, List<SubredditDomain>> {

    public SubredditRxSubscriber(RxCallback<List<SubredditDomain>> callback) {
        super(callback);
    }

    @Override
    public void onCompleted() {
        super.onCompleted();
    }

    @Override
    public void onError(Throwable e) {
        super.onError(e);
    }

    @Override
    public void onNext(SubredditResult data) {
        List<Subreddit> subredditList = new ArrayList<>();

        for(Children child : data.getChildrenList()) {
            subredditList.add(child.getSubreddit());
        }

        Converter subredditConverter = new SubredditConverter();

        mCallback.onDataReady(subredditConverter.convert(subredditList));
    }
}
