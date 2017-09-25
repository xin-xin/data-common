package data.common.nosql.repo;

import org.springframework.data.repository.CrudRepository;

import data.common.domain.nosql.Tweet;

public interface TweetRepository extends CrudRepository<Tweet, Long> {
	// public final static String FIND_BY_RANG_QUERY = "SELECT b "
	// + "FROM Tweet b "
	// + "WHERE b.created_at >= :start and b.created_at < :end";
	//
	// @Query(FIND_BY_RANG_QUERY)
	// public List<Tweet> findByRang(@Param("start") String start,
	// @Param("end") String end);
	//
	// @Query(FIND_BY_RANG_QUERY)
	// public Page<Tweet> findByRang(@Param("start") String start,
	// @Param("end") String end, Pageable page);
}
