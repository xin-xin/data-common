package data.common.domain.nosql;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.data.annotation.Transient;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table(value = "twitter_user")
public class TwitterUser {
	@PrimaryKey
	private long id;
	@Column(value = "name")
	private String name;
	@Column(value = "screen_name")
	private String screen_name;
	@Column(value = "location")
	private String location;
	@Column(value = "url")
	private String url;
	@Column(value = "description")
	private String description;
	@Column(value = "protected")
	private boolean _protected;
	@Column(value = "followers_count")
	private long followers_count;
	@Column(value = "friends_count")
	private long friends_count;
	@Column(value = "listed_count")
	private long listed_count;
	@Column(value = "created_time")
	private Date created_time;
	@Transient
	private String created_at;
	@Column(value = "favourites_count")
	private long favourites_count;
	@Column(value = "utc_offset")
	private String utc_offset;
	@Column(value = "time_zone")
	private String time_zone;
	@Column(value = "geo_enabled")
	private boolean geo_enabled;
	@Column(value = "verified")
	private boolean verified;
	@Column(value = "statuses_count")
	private long statuses_count;
	@Column(value = "lang")
	private String lang;
	@Column(value = "contributors_enabled")
	private boolean contributors_enabled;
	@Column(value = "is_translator")
	private boolean is_translator;
	@Column(value = "is_translation_enabled")
	private boolean is_translation_enabled;
	@Column(value = "profile_background_color")
	private String profile_background_color;
	@Column(value = "profile_background_image_url")
	private String profile_background_image_url;
	@Column(value = "profile_background_image_url_https")
	private String profile_background_image_url_https;
	@Column(value = "profile_background_tile")
	private boolean profile_background_tile;
	@Column(value = "profile_image_url")
	private String profile_image_url;
	@Column(value = "profile_image_url_https")
	private String profile_image_url_https;
	@Column(value = "profile_link_color")
	private String profile_link_color;
	@Column(value = "profile_sidebar_border_color")
	private String profile_sidebar_border_color;
	@Column(value = "profile_sidebar_fill_color")
	private String profile_sidebar_fill_color;
	@Column(value = "profile_text_color")
	private String profile_text_color;
	@Column(value = "profile_use_background_image")
	private boolean profile_use_background_image;
	@Column(value = "default_profile")
	private boolean default_profile;
	@Column(value = "default_profile_image")
	private boolean default_profile_image;
	@Column(value = "following")
	private String following;
	@Column(value = "follow_request_sent")
	
	private boolean follow_request_sent;
	@Column(value = "notifications")
	private String notifications;
	@Column(value = "captured_at")
	private Date captured_at;
	@Column(value = "last_updated")
	private Date last_updated;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getScreen_name() {
		return screen_name;
	}

	public void setScreen_name(String screen_name) {
		this.screen_name = screen_name;
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

	public boolean is_protected() {
		return _protected;
	}

	public void set_protected(boolean _protected) {
		this._protected = _protected;
	}

	public long getFollowers_count() {
		return followers_count;
	}

	public void setFollowers_count(long followers_count) {
		this.followers_count = followers_count;
	}

	public long getFriends_count() {
		return friends_count;
	}

	public void setFriends_count(long friends_count) {
		this.friends_count = friends_count;
	}

	public long getListed_count() {
		return listed_count;
	}

	public void setListed_count(long listed_count) {
		this.listed_count = listed_count;
	}

	public long getFavourites_count() {
		return favourites_count;
	}

	public void setFavourites_count(long favourites_count) {
		this.favourites_count = favourites_count;
	}

	public String getUtc_offset() {
		return utc_offset;
	}

	public void setUtc_offset(String utc_offset) {
		this.utc_offset = utc_offset;
	}

	public String getTime_zone() {
		return time_zone;
	}

	public void setTime_zone(String time_zone) {
		this.time_zone = time_zone;
	}

	public boolean isGeo_enabled() {
		return geo_enabled;
	}

	public void setGeo_enabled(boolean geo_enabled) {
		this.geo_enabled = geo_enabled;
	}

	public boolean isVerified() {
		return verified;
	}

	public void setVerified(boolean verified) {
		this.verified = verified;
	}

	public long getStatuses_count() {
		return statuses_count;
	}

	public void setStatuses_count(long statuses_count) {
		this.statuses_count = statuses_count;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public boolean isContributors_enabled() {
		return contributors_enabled;
	}

	public void setContributors_enabled(boolean contributors_enabled) {
		this.contributors_enabled = contributors_enabled;
	}

	public boolean isIs_translator() {
		return is_translator;
	}

	public void setIs_translator(boolean is_translator) {
		this.is_translator = is_translator;
	}

	public boolean isIs_translation_enabled() {
		return is_translation_enabled;
	}

	public void setIs_translation_enabled(boolean is_translation_enabled) {
		this.is_translation_enabled = is_translation_enabled;
	}

	public String getProfile_background_color() {
		return profile_background_color;
	}

	public void setProfile_background_color(String profile_background_color) {
		this.profile_background_color = profile_background_color;
	}

	public String getProfile_background_image_url() {
		return profile_background_image_url;
	}

	public void setProfile_background_image_url(
			String profile_background_image_url) {
		this.profile_background_image_url = profile_background_image_url;
	}

	public String getProfile_background_image_url_https() {
		return profile_background_image_url_https;
	}

	public void setProfile_background_image_url_https(
			String profile_background_image_url_https) {
		this.profile_background_image_url_https = profile_background_image_url_https;
	}

	public boolean isProfile_background_tile() {
		return profile_background_tile;
	}

	public void setProfile_background_tile(boolean profile_background_tile) {
		this.profile_background_tile = profile_background_tile;
	}

	public String getProfile_image_url() {
		return profile_image_url;
	}

	public void setProfile_image_url(String profile_image_url) {
		this.profile_image_url = profile_image_url;
	}

	public String getProfile_image_url_https() {
		return profile_image_url_https;
	}

	public void setProfile_image_url_https(String profile_image_url_https) {
		this.profile_image_url_https = profile_image_url_https;
	}

	public String getProfile_link_color() {
		return profile_link_color;
	}

	public void setProfile_link_color(String profile_link_color) {
		this.profile_link_color = profile_link_color;
	}

	public String getProfile_sidebar_border_color() {
		return profile_sidebar_border_color;
	}

	public void setProfile_sidebar_border_color(
			String profile_sidebar_border_color) {
		this.profile_sidebar_border_color = profile_sidebar_border_color;
	}

	public String getProfile_sidebar_fill_color() {
		return profile_sidebar_fill_color;
	}

	public void setProfile_sidebar_fill_color(String profile_sidebar_fill_color) {
		this.profile_sidebar_fill_color = profile_sidebar_fill_color;
	}

	public String getProfile_text_color() {
		return profile_text_color;
	}

	public void setProfile_text_color(String profile_text_color) {
		this.profile_text_color = profile_text_color;
	}

	public boolean isProfile_use_background_image() {
		return profile_use_background_image;
	}

	public void setProfile_use_background_image(
			boolean profile_use_background_image) {
		this.profile_use_background_image = profile_use_background_image;
	}

	public boolean isDefault_profile() {
		return default_profile;
	}

	public void setDefault_profile(boolean default_profile) {
		this.default_profile = default_profile;
	}

	public boolean isDefault_profile_image() {
		return default_profile_image;
	}

	public void setDefault_profile_image(boolean default_profile_image) {
		this.default_profile_image = default_profile_image;
	}

	public String getFollowing() {
		return following;
	}

	public void setFollowing(String following) {
		this.following = following;
	}

	public boolean getFollow_request_sent() {
		return follow_request_sent;
	}

	public void setFollow_request_sent(boolean follow_request_sent) {
		this.follow_request_sent = follow_request_sent;
	}

	public String getNotifications() {
		return notifications;
	}

	public void setNotifications(String notifications) {
		this.notifications = notifications;
	}

	public Date getLast_updated() {
		return last_updated;
	}

	public void setLast_updated(Date last_updated) {
		this.last_updated = last_updated;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public Date getCreated_time() {
		return created_time;
	}

	public void setCreated_time(Date created_time) {
		this.created_time = created_time;
	}

	public void setCaptured_at(Date captured_at) {
		this.captured_at = captured_at;
	}

	public Date getCaptured_at() {
		return captured_at;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void convertType() {
		SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM d HH:mm:ss Z yyyy");
		try {
			this.created_time = new Timestamp(sdf.parse(created_at).getTime());
		} catch (Exception e) {
		}
	}
}
