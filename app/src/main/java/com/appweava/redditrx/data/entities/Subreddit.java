package com.appweava.redditrx;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Subreddit {

    @SerializedName("banner_img")
    @Expose
    private String bannerImg;
    @SerializedName("user_sr_theme_enabled")
    @Expose
    private Boolean userSrThemeEnabled;
    @SerializedName("submit_text_html")
    @Expose
    private String submitTextHtml;
    @SerializedName("user_is_banned")
    @Expose
    private Object userIsBanned;
    @SerializedName("wiki_enabled")
    @Expose
    private Boolean wikiEnabled;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("submit_text")
    @Expose
    private String submitText;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("header_img")
    @Expose
    private String headerImg;
    @SerializedName("description_html")
    @Expose
    private String descriptionHtml;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("collapse_deleted_comments")
    @Expose
    private Boolean collapseDeletedComments;
    @SerializedName("over18")
    @Expose
    private Boolean over18;
    @SerializedName("public_description_html")
    @Expose
    private String publicDescriptionHtml;
    @SerializedName("icon_size")
    @Expose
    private List<Integer> iconSize = new ArrayList<Integer>();
    @SerializedName("suggested_comment_sort")
    @Expose
    private Object suggestedCommentSort;
    @SerializedName("icon_img")
    @Expose
    private String iconImg;
    @SerializedName("header_title")
    @Expose
    private String headerTitle;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("user_is_muted")
    @Expose
    private Object userIsMuted;
    @SerializedName("submit_link_label")
    @Expose
    private Object submitLinkLabel;
    @SerializedName("accounts_active")
    @Expose
    private Object accountsActive;
    @SerializedName("public_traffic")
    @Expose
    private Boolean publicTraffic;
    @SerializedName("header_size")
    @Expose
    private List<Integer> headerSize = new ArrayList<Integer>();
    @SerializedName("subscribers")
    @Expose
    private Integer subscribers;
    @SerializedName("submit_text_label")
    @Expose
    private Object submitTextLabel;
    @SerializedName("lang")
    @Expose
    private String lang;
    @SerializedName("user_is_moderator")
    @Expose
    private Object userIsModerator;
    @SerializedName("key_color")
    @Expose
    private String keyColor;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("created")
    @Expose
    private Integer created;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("quarantine")
    @Expose
    private Boolean quarantine;
    @SerializedName("hide_ads")
    @Expose
    private Boolean hideAds;
    @SerializedName("created_utc")
    @Expose
    private Integer createdUtc;
    @SerializedName("banner_size")
    @Expose
    private List<Integer> bannerSize = new ArrayList<Integer>();
    @SerializedName("user_is_contributor")
    @Expose
    private Object userIsContributor;
    @SerializedName("public_description")
    @Expose
    private String publicDescription;
    @SerializedName("comment_score_hide_mins")
    @Expose
    private Integer commentScoreHideMins;
    @SerializedName("subreddit_type")
    @Expose
    private String subredditType;
    @SerializedName("submission_type")
    @Expose
    private String submissionType;
    @SerializedName("user_is_subscriber")
    @Expose
    private Object userIsSubscriber;

    /**
     *
     * @return
     * The bannerImg
     */
    public String getBannerImg() {
        return bannerImg;
    }

    /**
     *
     * @param bannerImg
     * The banner_img
     */
    public void setBannerImg(String bannerImg) {
        this.bannerImg = bannerImg;
    }

    /**
     *
     * @return
     * The userSrThemeEnabled
     */
    public Boolean getUserSrThemeEnabled() {
        return userSrThemeEnabled;
    }

    /**
     *
     * @param userSrThemeEnabled
     * The user_sr_theme_enabled
     */
    public void setUserSrThemeEnabled(Boolean userSrThemeEnabled) {
        this.userSrThemeEnabled = userSrThemeEnabled;
    }

    /**
     *
     * @return
     * The submitTextHtml
     */
    public String getSubmitTextHtml() {
        return submitTextHtml;
    }

    /**
     *
     * @param submitTextHtml
     * The submit_text_html
     */
    public void setSubmitTextHtml(String submitTextHtml) {
        this.submitTextHtml = submitTextHtml;
    }

    /**
     *
     * @return
     * The userIsBanned
     */
    public Object getUserIsBanned() {
        return userIsBanned;
    }

    /**
     *
     * @param userIsBanned
     * The user_is_banned
     */
    public void setUserIsBanned(Object userIsBanned) {
        this.userIsBanned = userIsBanned;
    }

    /**
     *
     * @return
     * The wikiEnabled
     */
    public Boolean getWikiEnabled() {
        return wikiEnabled;
    }

    /**
     *
     * @param wikiEnabled
     * The wiki_enabled
     */
    public void setWikiEnabled(Boolean wikiEnabled) {
        this.wikiEnabled = wikiEnabled;
    }

    /**
     *
     * @return
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The submitText
     */
    public String getSubmitText() {
        return submitText;
    }

    /**
     *
     * @param submitText
     * The submit_text
     */
    public void setSubmitText(String submitText) {
        this.submitText = submitText;
    }

    /**
     *
     * @return
     * The displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     *
     * @param displayName
     * The display_name
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     *
     * @return
     * The headerImg
     */
    public String getHeaderImg() {
        return headerImg;
    }

    /**
     *
     * @param headerImg
     * The header_img
     */
    public void setHeaderImg(String headerImg) {
        this.headerImg = headerImg;
    }

    /**
     *
     * @return
     * The descriptionHtml
     */
    public String getDescriptionHtml() {
        return descriptionHtml;
    }

    /**
     *
     * @param descriptionHtml
     * The description_html
     */
    public void setDescriptionHtml(String descriptionHtml) {
        this.descriptionHtml = descriptionHtml;
    }

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The collapseDeletedComments
     */
    public Boolean getCollapseDeletedComments() {
        return collapseDeletedComments;
    }

    /**
     *
     * @param collapseDeletedComments
     * The collapse_deleted_comments
     */
    public void setCollapseDeletedComments(Boolean collapseDeletedComments) {
        this.collapseDeletedComments = collapseDeletedComments;
    }

    /**
     *
     * @return
     * The over18
     */
    public Boolean getOver18() {
        return over18;
    }

    /**
     *
     * @param over18
     * The over18
     */
    public void setOver18(Boolean over18) {
        this.over18 = over18;
    }

    /**
     *
     * @return
     * The publicDescriptionHtml
     */
    public String getPublicDescriptionHtml() {
        return publicDescriptionHtml;
    }

    /**
     *
     * @param publicDescriptionHtml
     * The public_description_html
     */
    public void setPublicDescriptionHtml(String publicDescriptionHtml) {
        this.publicDescriptionHtml = publicDescriptionHtml;
    }

    /**
     *
     * @return
     * The iconSize
     */
    public List<Integer> getIconSize() {
        return iconSize;
    }

    /**
     *
     * @param iconSize
     * The icon_size
     */
    public void setIconSize(List<Integer> iconSize) {
        this.iconSize = iconSize;
    }

    /**
     *
     * @return
     * The suggestedCommentSort
     */
    public Object getSuggestedCommentSort() {
        return suggestedCommentSort;
    }

    /**
     *
     * @param suggestedCommentSort
     * The suggested_comment_sort
     */
    public void setSuggestedCommentSort(Object suggestedCommentSort) {
        this.suggestedCommentSort = suggestedCommentSort;
    }

    /**
     *
     * @return
     * The iconImg
     */
    public String getIconImg() {
        return iconImg;
    }

    /**
     *
     * @param iconImg
     * The icon_img
     */
    public void setIconImg(String iconImg) {
        this.iconImg = iconImg;
    }

    /**
     *
     * @return
     * The headerTitle
     */
    public String getHeaderTitle() {
        return headerTitle;
    }

    /**
     *
     * @param headerTitle
     * The header_title
     */
    public void setHeaderTitle(String headerTitle) {
        this.headerTitle = headerTitle;
    }

    /**
     *
     * @return
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The userIsMuted
     */
    public Object getUserIsMuted() {
        return userIsMuted;
    }

    /**
     *
     * @param userIsMuted
     * The user_is_muted
     */
    public void setUserIsMuted(Object userIsMuted) {
        this.userIsMuted = userIsMuted;
    }

    /**
     *
     * @return
     * The submitLinkLabel
     */
    public Object getSubmitLinkLabel() {
        return submitLinkLabel;
    }

    /**
     *
     * @param submitLinkLabel
     * The submit_link_label
     */
    public void setSubmitLinkLabel(Object submitLinkLabel) {
        this.submitLinkLabel = submitLinkLabel;
    }

    /**
     *
     * @return
     * The accountsActive
     */
    public Object getAccountsActive() {
        return accountsActive;
    }

    /**
     *
     * @param accountsActive
     * The accounts_active
     */
    public void setAccountsActive(Object accountsActive) {
        this.accountsActive = accountsActive;
    }

    /**
     *
     * @return
     * The publicTraffic
     */
    public Boolean getPublicTraffic() {
        return publicTraffic;
    }

    /**
     *
     * @param publicTraffic
     * The public_traffic
     */
    public void setPublicTraffic(Boolean publicTraffic) {
        this.publicTraffic = publicTraffic;
    }

    /**
     *
     * @return
     * The headerSize
     */
    public List<Integer> getHeaderSize() {
        return headerSize;
    }

    /**
     *
     * @param headerSize
     * The header_size
     */
    public void setHeaderSize(List<Integer> headerSize) {
        this.headerSize = headerSize;
    }

    /**
     *
     * @return
     * The subscribers
     */
    public Integer getSubscribers() {
        return subscribers;
    }

    /**
     *
     * @param subscribers
     * The subscribers
     */
    public void setSubscribers(Integer subscribers) {
        this.subscribers = subscribers;
    }

    /**
     *
     * @return
     * The submitTextLabel
     */
    public Object getSubmitTextLabel() {
        return submitTextLabel;
    }

    /**
     *
     * @param submitTextLabel
     * The submit_text_label
     */
    public void setSubmitTextLabel(Object submitTextLabel) {
        this.submitTextLabel = submitTextLabel;
    }

    /**
     *
     * @return
     * The lang
     */
    public String getLang() {
        return lang;
    }

    /**
     *
     * @param lang
     * The lang
     */
    public void setLang(String lang) {
        this.lang = lang;
    }

    /**
     *
     * @return
     * The userIsModerator
     */
    public Object getUserIsModerator() {
        return userIsModerator;
    }

    /**
     *
     * @param userIsModerator
     * The user_is_moderator
     */
    public void setUserIsModerator(Object userIsModerator) {
        this.userIsModerator = userIsModerator;
    }

    /**
     *
     * @return
     * The keyColor
     */
    public String getKeyColor() {
        return keyColor;
    }

    /**
     *
     * @param keyColor
     * The key_color
     */
    public void setKeyColor(String keyColor) {
        this.keyColor = keyColor;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The created
     */
    public Integer getCreated() {
        return created;
    }

    /**
     *
     * @param created
     * The created
     */
    public void setCreated(Integer created) {
        this.created = created;
    }

    /**
     *
     * @return
     * The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     * The quarantine
     */
    public Boolean getQuarantine() {
        return quarantine;
    }

    /**
     *
     * @param quarantine
     * The quarantine
     */
    public void setQuarantine(Boolean quarantine) {
        this.quarantine = quarantine;
    }

    /**
     *
     * @return
     * The hideAds
     */
    public Boolean getHideAds() {
        return hideAds;
    }

    /**
     *
     * @param hideAds
     * The hide_ads
     */
    public void setHideAds(Boolean hideAds) {
        this.hideAds = hideAds;
    }

    /**
     *
     * @return
     * The createdUtc
     */
    public Integer getCreatedUtc() {
        return createdUtc;
    }

    /**
     *
     * @param createdUtc
     * The created_utc
     */
    public void setCreatedUtc(Integer createdUtc) {
        this.createdUtc = createdUtc;
    }

    /**
     *
     * @return
     * The bannerSize
     */
    public List<Integer> getBannerSize() {
        return bannerSize;
    }

    /**
     *
     * @param bannerSize
     * The banner_size
     */
    public void setBannerSize(List<Integer> bannerSize) {
        this.bannerSize = bannerSize;
    }

    /**
     *
     * @return
     * The userIsContributor
     */
    public Object getUserIsContributor() {
        return userIsContributor;
    }

    /**
     *
     * @param userIsContributor
     * The user_is_contributor
     */
    public void setUserIsContributor(Object userIsContributor) {
        this.userIsContributor = userIsContributor;
    }

    /**
     *
     * @return
     * The publicDescription
     */
    public String getPublicDescription() {
        return publicDescription;
    }

    /**
     *
     * @param publicDescription
     * The public_description
     */
    public void setPublicDescription(String publicDescription) {
        this.publicDescription = publicDescription;
    }

    /**
     *
     * @return
     * The commentScoreHideMins
     */
    public Integer getCommentScoreHideMins() {
        return commentScoreHideMins;
    }

    /**
     *
     * @param commentScoreHideMins
     * The comment_score_hide_mins
     */
    public void setCommentScoreHideMins(Integer commentScoreHideMins) {
        this.commentScoreHideMins = commentScoreHideMins;
    }

    /**
     *
     * @return
     * The subredditType
     */
    public String getSubredditType() {
        return subredditType;
    }

    /**
     *
     * @param subredditType
     * The subreddit_type
     */
    public void setSubredditType(String subredditType) {
        this.subredditType = subredditType;
    }

    /**
     *
     * @return
     * The submissionType
     */
    public String getSubmissionType() {
        return submissionType;
    }

    /**
     *
     * @param submissionType
     * The submission_type
     */
    public void setSubmissionType(String submissionType) {
        this.submissionType = submissionType;
    }

    /**
     *
     * @return
     * The userIsSubscriber
     */
    public Object getUserIsSubscriber() {
        return userIsSubscriber;
    }

    /**
     *
     * @param userIsSubscriber
     * The user_is_subscriber
     */
    public void setUserIsSubscriber(Object userIsSubscriber) {
        this.userIsSubscriber = userIsSubscriber;
    }

}