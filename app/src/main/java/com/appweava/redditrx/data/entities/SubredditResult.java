package com.appweava.redditrx.data.entities;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by weava on 3/22/16.
 */
public class SubredditResult {

    @SerializedName("modhash")
    @Expose
    private String mModHash;

    @SerializedName("children")
    @Expose
    private List<Children> mChildrenList;

    public List<Children> getChildrenList() {
        return mChildrenList;
    }

    public void setChildrenList(List<Children> children) {
        mChildrenList = children;
    }

    public String getModHash() {
        return mModHash;
    }

    public void setModHash(String modHash) {
        mModHash = modHash;
    }
}
