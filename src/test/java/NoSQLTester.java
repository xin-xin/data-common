import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import data.common.domain.nosql.Tweet;
import data.common.domain.nosql.TwitterUser;
import data.common.nosql.repo.TweetRepository;
import data.common.nosql.repo.TwitterUserRepository;

public class NoSQLTester {
	private GenericXmlApplicationContext context;

	public NoSQLTester() {

	}

	@Before
	public void init() {
		context = new GenericXmlApplicationContext("nosql-test.xml");
	}

	@Test
	public void testTweet() {
		TweetRepository tweetRepo = context.getBean(TweetRepository.class);

		Tweet tweet = new Tweet();
		tweet.setId(1);
		tweetRepo.save(tweet);

		Assert.assertNotNull(tweetRepo.findOne(1L));

	}
	
	@Test
	public void testUser(){
		TwitterUserRepository twitterUserRepo = context
				.getBean(TwitterUserRepository.class);

		TwitterUser user = new TwitterUser();
		user.setId(1);
		twitterUserRepo.save(user);
		
		Assert.assertNotNull(twitterUserRepo.findOne(1L));
	}
}
