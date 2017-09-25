package data.common.domain.rdbms;

import java.sql.Timestamp;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "twitter_topic")
public class TwitterTopic {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "uid")
	private long id;
	@Column(name = "topic")
	@Basic(optional = false)
	private String topic;
	@Column(name = "category")
	@Basic(optional = false)
	private String category;
	@Column(name = "latitude")
	@Basic(optional = false)
	private float latitude;
	@Column(name = "longitude")
	@Basic(optional = false)
	private float longitude;
	@Column(name = "radius")
	@Basic(optional = false)
	private float radius;
	@Column(name = "last_exec")
	private Timestamp last_exec;
	@Column(name = "last_count")
	private long last_count;
	@Column(name = "last_tweet_id")
	private String last_tweet_id;
	@Column(name = "created_at")
	@Basic(optional = false)
	private Timestamp createdAt;
	@Column(name = "updated_at")
	private Timestamp updated_at;
	@Column(name = "remark")
	private String remark;
	@Column(name = "origin_code")
	private String origin_code;
	
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
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
	public float getLatitude() {
		return latitude;
	}
	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	public float getRadius() {
		return radius;
	}
	public void setRadius(float radius) {
		this.radius = radius;
	}
	public Timestamp getLast_exec() {
		return last_exec;
	}
	public void setLast_exec(Timestamp last_exec) {
		this.last_exec = last_exec;
	}
	public long getLast_count() {
		return last_count;
	}
	public void setLast_count(long last_count) {
		this.last_count = last_count;
	}
	public String getLast_tweet_id() {
		return last_tweet_id;
	}
	public void setLast_tweet_id(String last_tweet_id) {
		this.last_tweet_id = last_tweet_id;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createAt) {
		this.createdAt = createAt;
	}
	public Timestamp getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Timestamp updated_at) {
		this.updated_at = updated_at;
	}
}
