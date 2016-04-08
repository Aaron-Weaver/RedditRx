package com.appweava.redditrx.domain.entities;

/**
 * Created by weava on 4/7/16.
 */
public class SubredditModel {

    private String mBannerImageUrl;
    private String mId;
    private String mDisplayName;
    private String mTitle;
    private boolean mIsNSFW;
    private String mHeaderTitle;
    private String mDescription;
    private int mNumSubs;
    private String mKeyColor;
    private String mName;
    private String mUrl;
    private String mPublicDescription;
    private String mSubredditType;
    private String mHeaderImage;
    private String mIconImage;

    public String getBannerImageUrl() {
        return mBannerImageUrl;
    }

    public void setBannerImageUrl(String bannerImageUrl) {
        mBannerImageUrl = bannerImageUrl;
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public String getDisplayName() {
        return mDisplayName;
    }

    public void setDisplayName(String displayName) {
        mDisplayName = displayName;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public boolean isNSFW() {
        return mIsNSFW;
    }

    public void setNSFW(boolean NSFW) {
        mIsNSFW = NSFW;
    }

    public String getHeaderTitle() {
        return mHeaderTitle;
    }

    public void setHeaderTitle(String headerTitle) {
        mHeaderTitle = headerTitle;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

    public int getNumSubs() {
        return mNumSubs;
    }

    public void setNumSubs(int numSubs) {
        mNumSubs = numSubs;
    }

    public String getKeyColor() {
        return mKeyColor;
    }

    public void setKeyColor(String keyColor) {
        mKeyColor = keyColor;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

    public String getPublicDescription() {
        return mPublicDescription;
    }

    public void setPublicDescription(String publicDescription) {
        mPublicDescription = publicDescription;
    }

    public String getSubredditType() {
        return mSubredditType;
    }

    public void setSubredditType(String subredditType) {
        mSubredditType = subredditType;
    }

    public String getHeaderImage() {
        return mHeaderImage;
    }

    public void setHeaderImage(String headerImage) {
        mHeaderImage = headerImage;
    }

    public String getIconImage() {
        return mIconImage;
    }

    public void setIconImage(String iconImage) {
        mIconImage = iconImage;
    }
}
