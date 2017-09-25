package data.common.domain.nosql;

public class TweetEntity {
	private TweetHashtag[] hashtags;
	private TweetUserMention[] user_mentions;

	public TweetHashtag[] getHashtags() {
		return hashtags;
	}

	public void setHashtags(TweetHashtag[] hashtags) {
		this.hashtags = hashtags;
	}

	public TweetUserMention[] getUser_mentions() {
		return user_mentions;
	}

	public void setUser_mentions(TweetUserMention[] user_mentions) {
		this.user_mentions = user_mentions;
	}
}
