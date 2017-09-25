package data.common.domain.nosql;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.data.annotation.Transient;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table(value = "twitter_user")
public class TwitterUser {
	@Transient
	private Logger log = Logger.getLogger(this.getClass());
	@PrimaryKey
	private long id;
	@Column(value = "name")
	private String name;
	@Column(value = "screen_name")
	private String screenName;
	@Column(value = "location")
	private String location;
	@Column(value = "url")
	private String url;
	@Column(value = "description")
	private String description;
	@Column(value = "protected")
	private boolean bProtected;
	@Column(value = "followers_count")
	private long followersCount;
	@Column(value = "friends_count")
	private long friendsCount;
	@Column(value = "listed_count")
	private long listedCount;
	@Column(value = "created_time")
	private Date createdTime;
	@Transient
	private String createdAt;
	@Column(value = "favourites_count")
	private long favouritesCount;
	@Column(value = "utc_offset")
	private String utcOffset;
	@Column(value = "time_zone")
	private String timeZone;
	@Column(value = "geo_enabled")
	private boolean geoEnabled;
	@Column(value = "verified")
	private boolean verified;
	@Column(value = "statuses_count")
	private long statusesCount;
	@Column(value = "lang")
	private String lang;
	@Column(value = "contributors_enabled")
	private boolean contributorsEnabled;
	@Column(value = "is_translator")
	private boolean isTranslator;
	@Column(value = "is_translation_enabled")
	private boolean isTranslationEnabled;
	@Column(value = "profile_background_color")
	private String profileBackgroundColor;
	@Column(value = "profile_background_image_url")
	private String profileBackgroundImageUrl;
	@Column(value = "profile_background_image_url_https")
	private String profileBackgroundImageUrlHttps;
	@Column(value = "profile_background_tile")
	private boolean profileBackgroundTile;
	@Column(value = "profile_image_url")
	private String profileImageUrl;
	@Column(value = "profile_image_url_https")
	private String profileImageUrlHttps;
	@Column(value = "profile_link_color")
	private String profileLinkColor;
	@Column(value = "profile_sidebar_border_color")
	private String profileSidebarBorderColor;
	@Column(value = "profile_sidebar_fill_color")
	private String profileSidebarFillColor;
	@Column(value = "profile_text_color")
	private String profileTextColor;
	@Column(value = "profile_use_background_image")
	private boolean profileUseBackgroundImage;
	@Column(value = "default_profile")
	private boolean defaultProfile;
	@Column(value = "default_profile_image")
	private boolean defaultProfileImage;
	@Column(value = "following")
	private String following;
	@Column(value = "follow_request_sent")
	private boolean followRequestSent;
	@Column(value = "notifications")
	private String notifications;
	@Column(value = "captured_at")
	private Date capturedAt;
	@Column(value = "last_updated")
	private Date lastUpdated;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isProtected() {
		return bProtected;
	}

	public void setProtected(boolean bProtected) {
		this.bProtected = bProtected;
	}

	public long getFollowersCount() {
		return followersCount;
	}

	public void setFollowersCount(long followersCount) {
		this.followersCount = followersCount;
	}

	public long getFriendsCount() {
		return friendsCount;
	}

	public void setFriendsCount(long friendsCount) {
		this.friendsCount = friendsCount;
	}

	public long getListedCount() {
		return listedCount;
	}

	public void setListedCount(long listedCount) {
		this.listedCount = listedCount;
	}

	public long getFavouritesCount() {
		return favouritesCount;
	}

	public void setFavouritesCount(long favouritesCount) {
		this.favouritesCount = favouritesCount;
	}

	public String getUtcOffset() {
		return utcOffset;
	}

	public void setUtcOffset(String utcOffset) {
		this.utcOffset = utcOffset;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public boolean isGeoEnabled() {
		return geoEnabled;
	}

	public void setGeoEnabled(boolean geoEnabled) {
		this.geoEnabled = geoEnabled;
	}

	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	public long getStatusesCount() {
		return statusesCount;
	}

	public void setStatusesCount(long statusesCount) {
		this.statusesCount = statusesCount;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public boolean isContributorsEnabled() {
		return contributorsEnabled;
	}

	public void setContributorsEnabled(boolean contributorsEnabled) {
		this.contributorsEnabled = contributorsEnabled;
	}

	public boolean isIsTranslator() {
		return isTranslator;
	}

	public void setIsTranslator(boolean isTranslator) {
		this.isTranslator = isTranslator;
	}

	public boolean isIsTranslationEnabled() {
		return isTranslationEnabled;
	}

	public void setIsTranslationEnabled(boolean isTranslationEnabled) {
		this.isTranslationEnabled = isTranslationEnabled;
	}

	public String getProfileBackgroundColor() {
		return profileBackgroundColor;
	}

	public void setProfileBackgroundColor(String profileBackgroundColor) {
		this.profileBackgroundColor = profileBackgroundColor;
	}

	public String getProfileBackgroundImageUrl() {
		return profileBackgroundImageUrl;
	}

	public void setProfileBackgroundImageUrl(String profileBackgroundImageUrl) {
		this.profileBackgroundImageUrl = profileBackgroundImageUrl;
	}

	public String getProfileBackgroundImageUrlHttps() {
		return profileBackgroundImageUrlHttps;
	}

	public void setProfileBackgroundImageUrlHttps(String profileBackgroundImageUrlHttps) {
		this.profileBackgroundImageUrlHttps = profileBackgroundImageUrlHttps;
	}

	public boolean isProfileBackgroundTile() {
		return profileBackgroundTile;
	}

	public void setProfileBackgroundTile(boolean profileBackgroundTile) {
		this.profileBackgroundTile = profileBackgroundTile;
	}

	public String getProfileImageUrl() {
		return profileImageUrl;
	}

	public void setProfileImageUrl(String profileImageUrl) {
		this.profileImageUrl = profileImageUrl;
	}

	public String getProfileImageUrlHttps() {
		return profileImageUrlHttps;
	}

	public void setProfileImageUrlHttps(String profileImageUrlHttps) {
		this.profileImageUrlHttps = profileImageUrlHttps;
	}

	public String getProfileLinkColor() {
		return profileLinkColor;
	}

	public void setProfileLinkColor(String profileLinkColor) {
		this.profileLinkColor = profileLinkColor;
	}

	public String getProfileSidebarBorderColor() {
		return profileSidebarBorderColor;
	}

	public void setProfileSidebarBorderColor(String profileSidebarBorderColor) {
		this.profileSidebarBorderColor = profileSidebarBorderColor;
	}

	public String getProfileSidebarFillColor() {
		return profileSidebarFillColor;
	}

	public void setProfileSidebarFillColor(String profileSidebarFillColor) {
		this.profileSidebarFillColor = profileSidebarFillColor;
	}

	public String getProfileTextColor() {
		return profileTextColor;
	}

	public void setProfileTextColor(String profileTextColor) {
		this.profileTextColor = profileTextColor;
	}

	public boolean isProfileUseBackgroundImage() {
		return profileUseBackgroundImage;
	}

	public void setProfileUseBackgroundImage(boolean profileUseBackgroundImage) {
		this.profileUseBackgroundImage = profileUseBackgroundImage;
	}

	public boolean isDefaultProfile() {
		return defaultProfile;
	}

	public void setDefaultProfile(boolean defaultProfile) {
		this.defaultProfile = defaultProfile;
	}

	public boolean isDefaultProfileImage() {
		return defaultProfileImage;
	}

	public void setDefaultProfileImage(boolean defaultProfileImage) {
		this.defaultProfileImage = defaultProfileImage;
	}

	public String getFollowing() {
		return following;
	}

	public void setFollowing(String following) {
		this.following = following;
	}

	public boolean getFollowRequestSent() {
		return followRequestSent;
	}

	public void setFollowRequestSent(boolean followRequestSent) {
		this.followRequestSent = followRequestSent;
	}

	public String getNotifications() {
		return notifications;
	}

	public void setNotifications(String notifications) {
		this.notifications = notifications;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public void setCapturedAt(Date capturedAt) {
		this.capturedAt = capturedAt;
	}

	public Date getCapturedAt() {
		return capturedAt;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void convertType() {
		SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM d HH:mm:ss Z yyyy");
		try {
			this.createdTime = new Timestamp(sdf.parse(createdAt).getTime());
		} catch (Exception e) {
			log.error("Convert timestamp error.", e);
		}
	}
}
