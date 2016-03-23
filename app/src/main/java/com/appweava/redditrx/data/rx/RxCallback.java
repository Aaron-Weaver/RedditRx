package com.appweava.redditrx.data.rx;

/**
 * Created by weava on 3/22/16.
 */
public interface RxCallback<T> {

    void onDataReady(T data);

    void onDataError(Throwable e);
}
