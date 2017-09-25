package data.common.domain.nosql;

public class TweetEntity {
	private TweetHashtag[] hashtags;
	private TweetUserMention[] userMentions;

	public TweetHashtag[] getHashtags() {
		return hashtags;
	}

	public void setHashtags(TweetHashtag[] hashtags) {
		this.hashtags = hashtags;
	}

	public TweetUserMention[] getUserMentions() {
		return userMentions;
	}

	public void setUserMentions(TweetUserMention[] userMentions) {
		this.userMentions = userMentions;
	}
}
