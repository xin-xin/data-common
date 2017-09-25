package data.common.domain.nosql;

public class TweetUserMention {
	private String screenName;
	private String name;
	private String idStr;
	private long[] indices;

	public String getScreenName() {
		return screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdStr() {
		return idStr;
	}

	public void setIdStr(String idStr) {
		this.idStr = idStr;
	}

	public long[] getIndices() {
		return indices;
	}

	public void setIndices(long[] indices) {
		this.indices = indices;
	}
}
