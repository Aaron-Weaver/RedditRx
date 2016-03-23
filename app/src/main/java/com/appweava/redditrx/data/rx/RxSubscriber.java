package com.appweava.redditrx.data.rx;

import android.util.Log;

import rx.Subscriber;

/**
 * Created by weava on 3/22/16.
 */
public class RxSubscriber<T> extends Subscriber<T> {

    private final String TAG = "Subscription Error";
    RxCallback<T> mCallback;

    public RxSubscriber(RxCallback<T> callback) {
        this.mCallback = callback;
    }

    public RxSubscriber() { }

    @Override
    public void onCompleted() {
        unsubscribe();
    }

    @Override
    public void onError(Throwable e) {
        Log.e(TAG, e.getMessage());
        mCallback.onDataError(e);
    }

    @Override
    public void onNext(T data) {
        mCallback.onDataReady(data);
    }
}
