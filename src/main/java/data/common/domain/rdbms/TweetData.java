package data.common.domain.rdbms;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "tweet_data")
public class TweetData {
	@Id
	@Column(name = "tweet_id")
	private String tweet_id;
	@Column(name = "content")
	private String content;
	@Column(name = "tweet_created")
	private Timestamp tweet_created;
	@Column(name = "reply_to_id")
	private String reply_to_id;
	@Column(name = "reply_to_uid")
	private String reply_to_uid;
	@Column(name = "screen_name")
	private String screen_name;
	@Column(name = "user_id")
	private String user_id;
	@Column(name = "captured_at")
	private Timestamp captured_at;
	@Column(name = "captured_by")
	private String captured_by;
	@Column(name = "topic")
	private String topic;
	@Column(name = "category")
	private String category;
	@Column(name = "hashtag")
	private String hashtag;
	@Column(name = "origin_code")
	private String origin_code;
	@Column(name = "native_lang")
	private String native_lang;
	@Column(name = "content_en")
	private String content_en;

	public String getNative_lang() {
		return native_lang;
	}

	public void setNative_lang(String native_lang) {
		this.native_lang = native_lang;
	}

	public String getContent_en() {
		return content_en;
	}

	public void setContent_en(String content_en) {
		this.content_en = content_en;
	}

	public String getOrigin_code() {
		return origin_code;
	}

	public void setOrigin_code(String origin_code) {
		this.origin_code = origin_code;
	}

	@Transient
	private final String SEP = "$|$";
	@Transient
	private List<String> cateList = new ArrayList<String>();
	@Transient
	private List<String> topicList = new ArrayList<String>();
	@Transient
	private List<String> hashtagList = new ArrayList<String>();

	public String getTweet_id() {
		return tweet_id;
	}

	public void setTweet_id(String tweet_id) {
		this.tweet_id = tweet_id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getTweet_created() {
		return tweet_created;
	}

	public void setTweet_created(Timestamp tweet_created) {
		this.tweet_created = tweet_created;
	}

	public String getReply_to_id() {
		return reply_to_id;
	}

	public void setReply_to_id(String reply_to_id) {
		this.reply_to_id = reply_to_id;
	}

	public String getReply_to_uid() {
		return reply_to_uid;
	}

	public void setReply_to_uid(String reply_to_uid) {
		this.reply_to_uid = reply_to_uid;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public Timestamp getCaptured_at() {
		return captured_at;
	}

	public String getScreen_name() {
		return screen_name;
	}

	public void setScreen_name(String screen_name) {
		this.screen_name = screen_name;
	}

	public void setCaptured_at(Timestamp captured_at) {
		this.captured_at = captured_at;
	}

	public String getCaptured_by() {
		return captured_by;
	}

	public void setCaptured_by(String captured_by) {
		this.captured_by = captured_by;
	}

	public void addTopic(String tc) {
		if (tc != null && !"".equals(tc)) {
			this.topicList.add(tc);
		}
		this.topic = this.getTopic();
	}

	public String getTopic() {
		topic = SEP;
		for (String st : topicList) {
			topic += st;
			topic += SEP;
		}
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
		this.topicList.clear();
		if (topic != null && !"".equals(topic)) {
			for (String st : topic.split(SEP)) {
				if (!this.topicList.contains(st)) {
					this.topicList.add(st);
				}
			}
		}
	}

	public void addCategory(String ca) {
		if (ca != null && !"".equals(ca)) {
			this.cateList.add(ca);
		}
		this.category = this.getCategory();
	}

	public String getCategory() {
		category = SEP;
		for (String ca : cateList) {
			category += ca;
			category += SEP;
		}
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
		this.cateList.clear();
		if (category != null && !"".equals(category)) {
			for (String ca : category.split(SEP)) {
				if (!this.cateList.contains(ca)) {
					this.cateList.add(ca);
				}
			}
		}
	}

	public void addHashtag(String ht) {
		if (ht != null && !"".equals(ht)) {
			this.hashtagList.add(ht);
		}
		this.hashtag = this.getHashtag();
	}

	public String getHashtag() {
		hashtag = SEP;
		for (String ht : hashtagList) {
			hashtag += ht;
			hashtag += SEP;
		}
		return hashtag;
	}

	public void setHashtag(String hashtag) {
		this.hashtag = hashtag;
		this.hashtagList.clear();
		if (hashtag != null && !"".equals(hashtag)) {
			for (String ht : hashtag.split(SEP)) {
				if (!this.hashtagList.contains(ht)) {
					this.hashtagList.add(ht);
				}
			}
		}
	}
}
