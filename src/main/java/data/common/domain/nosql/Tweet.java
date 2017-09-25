package data.common.domain.nosql;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.data.annotation.Transient;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

import data.common.util.JsonUtil;

@Table(value = "tweet")
public class Tweet {
	@PrimaryKey
	private long id;
	@Column(value = "content")
	private String text;
	@Transient
	private String created_at;
	@Column(value = "created_time")
	private long created_time;
	@Column(value = "id_str")
	private String id_str;
	@Column(value = "source")
	private String source;
	@Column(value = "truncated")
	private boolean truncated;
	@Column(value = "in_reply_to_status_id")
	private long in_reply_to_status_id;
	@Column(value = "in_reply_to_status_id_str")
	private String in_reply_to_status_id_str;
	@Column(value = "in_reply_to_user_id")
	private long in_reply_to_user_id;
	@Column(value = "in_reply_to_user_id_str")
	private String in_reply_to_user_id_str;
	@Column(value = "in_reply_to_screen_name")
	private String in_reply_to_screen_name;
	@Transient
	private Coordinate geo;
	@Column(value = "geo_str")
	private String geo_str;
	@Transient
	private Coordinate coordinates;
	@Column(value = "coordinates_str")
	private String coordinates_str;
	@Column(value = "contributors")
	private String contributors;
	@Column(value = "retweet_count")
	private int retweet_count;
	@Column(value = "favorite_count")
	private int favorite_count;
	@Column(value = "favorited")
	private boolean favorited;
	@Column(value = "retweeted")
	private boolean retweeted;
	@Column(value = "possibly_sensitive")
	private boolean possibly_sensitive;
	@Column(value = "filter_level")
	private String filter_level;
	@Column(value = "lang")
	private String lang;
	@Transient
	private TwitterUser user;
	@Column(value = "userid")
	private long userid;
	@Column(value = "screen_name")
	private String screen_name;
	@Column(value = "captured_at")
	private Date captured_at;
	@Column(value = "captured_by")
	private String captured_by;
	@Transient
	private TweetEntity entities;
	@Transient
	private String topic;
	@Transient
	private String category;
	@Transient
	private String origin_code;

	public String getOrigin_code() {
		return origin_code;
	}

	public void setOrigin_code(String origin_code) {
		this.origin_code = origin_code;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getId_str() {
		return id_str;
	}

	public void setId_str(String id_str) {
		this.id_str = id_str;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public boolean isTruncated() {
		return truncated;
	}

	public void setTruncated(boolean truncated) {
		this.truncated = truncated;
	}

	public long getIn_reply_to_status_id() {
		return in_reply_to_status_id;
	}

	public void setIn_reply_to_status_id(long in_reply_to_status_id) {
		this.in_reply_to_status_id = in_reply_to_status_id;
	}

	public String getIn_reply_to_status_id_str() {
		return in_reply_to_status_id_str;
	}

	public void setIn_reply_to_status_id_str(String in_reply_to_status_id_str) {
		this.in_reply_to_status_id_str = in_reply_to_status_id_str;
	}

	public long getIn_reply_to_user_id() {
		return in_reply_to_user_id;
	}

	public void setIn_reply_to_user_id(long in_reply_to_user_id) {
		this.in_reply_to_user_id = in_reply_to_user_id;
	}

	public String getIn_reply_to_user_id_str() {
		return in_reply_to_user_id_str;
	}

	public void setIn_reply_to_user_id_str(String in_reply_to_user_id_str) {
		this.in_reply_to_user_id_str = in_reply_to_user_id_str;
	}

	public String getIn_reply_to_screen_name() {
		return in_reply_to_screen_name;
	}

	public void setIn_reply_to_screen_name(String in_reply_to_screen_name) {
		this.in_reply_to_screen_name = in_reply_to_screen_name;
	}

	public Coordinate getGeo() {
		return geo;
	}

	public void setGeo(Coordinate geo) {
		this.geo = geo;
	}

	public Coordinate getCoordinates() {
		return coordinates;
	}

	public void setCoordinates(Coordinate coordinates) {
		this.coordinates = coordinates;
	}

	// public String getPlace() {
	// return place;
	// }
	//
	// public void setPlace(String place) {
	// this.place = place;
	// }

	public String getContributors() {
		return contributors;
	}

	public void setContributors(String contributors) {
		this.contributors = contributors;
	}

	public int getRetweet_count() {
		return retweet_count;
	}

	public void setRetweet_count(int retweet_count) {
		this.retweet_count = retweet_count;
	}

	public int getFavorite_count() {
		return favorite_count;
	}

	public void setFavorite_count(int favorite_count) {
		this.favorite_count = favorite_count;
	}

	public boolean isFavorited() {
		return favorited;
	}

	public void setFavorited(boolean favorited) {
		this.favorited = favorited;
	}

	public boolean isRetweeted() {
		return retweeted;
	}

	public void setRetweeted(boolean retweeted) {
		this.retweeted = retweeted;
	}

	public boolean isPossibly_sensitive() {
		return possibly_sensitive;
	}

	public void setPossibly_sensitive(boolean possibly_sensitive) {
		this.possibly_sensitive = possibly_sensitive;
	}

	public String getFilter_level() {
		return filter_level;
	}

	public void setFilter_level(String filter_level) {
		this.filter_level = filter_level;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public TwitterUser getUser() {
		return user;
	}

	public void setUser(TwitterUser user) {
		this.user = user;
	}

	public Date getCaptured_at() {
		return captured_at;
	}

	public void setCaptured_at(Date caputured_at) {
		this.captured_at = caputured_at;
	}

	public String getCaptured_by() {
		return captured_by;
	}

	public void setCaptured_by(String captured_by) {
		this.captured_by = captured_by;
	}

	public long getCreated_time() {
		return created_time;
	}

	public void setCreated_time(long created_time) {
		this.created_time = created_time;
	}

	public TweetEntity getEntities() {
		return entities;
	}

	public void setEntities(TweetEntity entities) {
		this.entities = entities;
	}

	public void convertType() {
		SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM d HH:mm:ss Z yyyy");
		try {
			this.created_time = sdf.parse(created_at).getTime();
		} catch (Exception e) {
		}
		this.userid = this.user.getId();
		this.screen_name = this.user.getScreenName();
		this.geo_str = JsonUtil.toJson(this.geo);
		this.coordinates_str = JsonUtil.toJson(this.coordinates);
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}
