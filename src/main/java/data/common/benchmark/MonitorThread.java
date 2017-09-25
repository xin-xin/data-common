package data.common.benchmark;

import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import data.common.domain.rdbms.Benchmark;
import data.common.rdbms.BenchmarkRepository;
import data.common.util.JsonUtil;

public class MonitorThread implements Runnable {
	private String module = null;
	private Logger log = Logger.getLogger(MonitorThread.class);

	public MonitorThread(String module) {
		this.module = module;
	}

	public void run() {
		try {
			log.debug("Monitor thread started.");
			Runtime runtime = Runtime.getRuntime();
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
					"database-default.xml");
			BenchmarkRepository br = context.getBean(BenchmarkRepository.class);
			Benchmark b = new Benchmark();
			b.setAllocated_mem(runtime.totalMemory());
			b.setFree_mem(runtime.freeMemory());
			b.setMax_mem(runtime.maxMemory());
			Map<String, Long> queues = new HashMap<String, Long>();
//			for (String name : QueueHelper.getAllQueueName()) {
//				queues.put(name, QueueHelper.getQueue(name).size());
//			}
			//b.setQueue(gson.toJson(queues));
			b.setQueue(JsonUtil.toJson(queues));
			b.setCreated_at(new Timestamp((new Date()).getTime()));
			b.setModule(this.module);
			br.save(b);
			context.close();
			log.debug("Monitor thread stopped.");
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
		}
	}
}
