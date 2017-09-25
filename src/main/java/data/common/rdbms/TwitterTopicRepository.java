package data.common.rdbms;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import data.common.domain.rdbms.TwitterTopic;

public interface TwitterTopicRepository extends
		JpaRepository<TwitterTopic, Long> {
	public List<TwitterTopic> findByCategory(String category);
}
