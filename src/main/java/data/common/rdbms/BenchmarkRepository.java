package data.common.rdbms;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import data.common.domain.rdbms.Benchmark;

public interface BenchmarkRepository extends JpaRepository<Benchmark, Long> {
	public final static String FIND_BY_RANG_QUERY = "SELECT b "
			+ "FROM Benchmark b "
			+ "WHERE b.created_at >= :start and b.created_at < :end";

	@Query(FIND_BY_RANG_QUERY)
	public List<Benchmark> findByCreated(@Param("start") String start,
			@Param("end") String end);

	@Query(FIND_BY_RANG_QUERY)
	public Page<Benchmark> findByCreated(@Param("start") String start,
			@Param("end") String end, Pageable page);
}
