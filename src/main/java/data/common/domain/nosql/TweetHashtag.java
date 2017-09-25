package data.common.domain.nosql;

public class TweetHashtag {
	private String text;
	private long[] indices;
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public long[] getIndices() {
		return indices;
	}
	public void setIndices(long[] indices) {
		this.indices = indices;
	}
}
