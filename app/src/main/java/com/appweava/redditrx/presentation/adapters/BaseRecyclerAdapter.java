package com.appweava.redditrx.presentation.adapters;

import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.appweava.redditrx.presentation.viewHolders.BaseViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by weava on 3/30/16.
 */
public abstract class BaseRecyclerAdapter<T> extends RecyclerView.Adapter<BaseViewHolder<T>> {

    protected List<T> mElements;

    public BaseRecyclerAdapter() {
        mElements = new ArrayList<>();
    }

    @Override
    public BaseViewHolder<T> onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(getLayoutRes(), parent, false);
        return inflateViewHolder(view);
    }

    public abstract @LayoutRes int getLayoutRes();

    public abstract BaseViewHolder<T> inflateViewHolder(View view);

    @Override
    public void onBindViewHolder(BaseViewHolder<T> holder, int position) {
        holder.bind(mElements.get(position));
    }

    @Override
    public int getItemCount() {
        return mElements.size();
    }

    public void add(T object) {
        mElements.add(object);
        notifyItemInserted(mElements.size() - 1);
    }

    public void add(List<T> objects) {
        int tempSize = mElements.size();
        mElements.addAll(objects);
        notifyItemRangeInserted(tempSize - 1, objects.size());
    }

    public void remove(int position) {
        mElements.remove(position);
        notifyItemRemoved(position);
    }

    public void swapData(List<T> objects) {
        mElements.clear();
        this.add(objects);
    }

    public void clearAll() {
        mElements.clear();
        notifyDataSetChanged();
    }
}
