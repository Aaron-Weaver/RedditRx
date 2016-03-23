package com.appweava.redditrx.data.rx;

import android.util.Log;

import rx.Subscriber;

/**
 * Created by weava on 3/22/16.
 */
public abstract class ConverterRxSubscriber<I, O> extends Subscriber<I> {

    private final String TAG = "Subscription Error";

    RxCallback<O> mCallback;

    public ConverterRxSubscriber(RxCallback<O> callback) {
        this.mCallback = callback;
    }

    @Override
    public void onCompleted() {
        this.unsubscribe();
    }

    @Override
    public void onError(Throwable e) {
        Log.e(TAG, e.getMessage());
        mCallback.onDataError(e);
    }

    @Override
    abstract public void onNext(I data);
}
