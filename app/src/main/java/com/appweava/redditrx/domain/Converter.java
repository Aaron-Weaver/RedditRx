package com.appweava.redditrx.domain;

import java.util.List;

/**
 * Created by weava on 4/7/16.
 */
public interface Converter<I, O> {

    O convert(I itemToConvert);

    List<O> convert(List<I> itemsToConvert);
}
