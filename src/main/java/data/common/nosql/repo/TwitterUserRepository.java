package data.common.nosql.repo;

import org.springframework.data.repository.CrudRepository;

import data.common.domain.nosql.TwitterUser;

public interface TwitterUserRepository extends CrudRepository<TwitterUser, Long> {
}
