package data.common.rdbms;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import data.common.domain.rdbms.TweetData;

public interface TweetDataRepository extends JpaRepository<TweetData, String> {
	public final static String FIND_BY_RANG_QUERY = "SELECT b "
			+ "FROM TweetData b "
			+ "WHERE b.tweet_created >= :start and b.tweet_created < :end";
	
	public final static String FIND_BY_CATEGORY_QUERY = "SELECT b "
			+ "FROM TweetData b "
			+ "WHERE b.category = :category";

	@Query(FIND_BY_RANG_QUERY)
	public List<TweetData> findByCreated(@Param("start") String start,
			@Param("end") String end);

	@Query(FIND_BY_RANG_QUERY)
	public Page<TweetData> findByCreated(@Param("start") String start,
			@Param("end") String end, Pageable page);

	@Query(FIND_BY_CATEGORY_QUERY)
	public List<TweetData> findByCategory(@Param("category") String category);
}
