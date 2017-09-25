import java.sql.Timestamp;
import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import data.common.domain.rdbms.Benchmark;
import data.common.domain.rdbms.KeyTrend;
import data.common.rdbms.BenchmarkRepository;
import data.common.rdbms.KeytrendRepository;

public class DatabaseTester {
	private ClassPathXmlApplicationContext context;
	private BenchmarkRepository br;
	private KeytrendRepository ktr;
	private Long id;

	@Before
	public void init() throws Exception {
		context = new ClassPathXmlApplicationContext("database-test.xml");
		br = context.getBean(BenchmarkRepository.class);
		ktr = context.getBean(KeytrendRepository.class);
	}

	@Test
	public void BenchmarkTest() {
		Benchmark bc = new Benchmark();
		bc.setAllocated_mem(1);
		bc.setFree_mem(2);
		bc.setMax_mem(3);
		bc.setQueue("{\"twitter_queue\":123}");
		bc.setId(1L);
		bc = br.save(bc);
		id = bc.getId();
		Assert.assertNotNull(bc);
		bc = null;

		bc = br.findOne(id);
		Assert.assertNotNull(bc);

		br.delete(bc);
	}

	@Test
	public void KeyTrendTest() {
		KeyTrend kt = new KeyTrend();
		kt.setKey("test function");
		kt.setCount(5);
		kt.setCreateAt(new Timestamp((new Date()).getTime()));

		ktr.save(kt);
	}
}
