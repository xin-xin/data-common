package data.common.nosql;

import org.springframework.core.convert.converter.Converter;

import data.common.domain.nosql.TwitterUser;

public class TwitterUserConverter implements Converter<TwitterUser, Long> {

	public Long convert(TwitterUser user) {
		return user.getId();
	}
}
