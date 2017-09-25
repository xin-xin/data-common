package data.common.rdbms;

import org.springframework.data.jpa.repository.JpaRepository;

import data.common.domain.rdbms.KeyTrend;

public interface KeytrendRepository extends JpaRepository<KeyTrend, Long> {
}
