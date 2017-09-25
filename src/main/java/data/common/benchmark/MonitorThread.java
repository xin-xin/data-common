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
	//private final Gson gson = new GsonBuilder().create();

	public MonitorThread(String module) {
		this.module = module;
	}

	public void run() {
		try {
			log.debug("Monitor thread started.");
			Runtime runtime = Runtime.getRuntime();
			//log.debug("Got current JVM runtime.");
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
					"database-default.xml");
			//log.debug("Got spring context.");
			BenchmarkRepository br = context.getBean(BenchmarkRepository.class);
			//log.debug("Got repository bean.");
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
			//log.debug(b.getQueue());
			b.setCreated_at(new Timestamp((new Date()).getTime()));
			b.setModule(this.module);
			//log.debug("Set entity bean value.");
			br.save(b);
			//log.debug("Saved entity bean.");
			context.close();
			log.debug("Monitor thread stopped.");
		} catch (Exception ex) {
			log.error(ex.getMessage(), ex);
		}
	}
}
