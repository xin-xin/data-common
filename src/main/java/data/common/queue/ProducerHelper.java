package data.common.queue;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.kafka.support.KafkaProducerContext;
import org.springframework.integration.kafka.support.ProducerConfiguration;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.MessageChannel;

public class ProducerHelper 
{
	private static ProducerHelper helper = null;
	
	private static final String CONFIG = "/outbound-kafka-default.xml";
	
	private HashMap<String, DataQueue> queues = new HashMap<String,DataQueue>();
	
	private MessageChannel channel = null;
	private ClassPathXmlApplicationContext ctx = null;
	
	//init producer helper
	//init message channel
	@SuppressWarnings("rawtypes")
	private ProducerHelper()
	{
		ctx = new ClassPathXmlApplicationContext(CONFIG, ProducerHelper.class);
		ctx.start();
		
		channel = ctx.getBean("inputToKafka", MessageChannel.class); 
		
		KafkaProducerContext kfkCtx = (KafkaProducerContext)ctx.getBean("kafkaProducerContext");
		
		DataQueue queue = null;
		for(Object cfgObj: kfkCtx.getProducerConfigurations().values())
		{
			ProducerConfiguration cfg = (ProducerConfiguration)cfgObj;
			queue = new DataQueue(this);
			queue.setQueueName(cfg.getProducerMetadata().getTopic());
			queues.put(queue.getQueueName(), queue);
		}
		
	}
	
	private ProducerHelper(ProducerContext ctx)
	{
		//change message channel
	}
	
	private ProducerHelper(String configFilePath)
	{
		if(ctx != null)
		{
			ctx.close();
		}
		ctx = new ClassPathXmlApplicationContext(configFilePath, ProducerHelper.class);
		
		ctx.start();
	}
	
	public static ProducerHelper getHelper()
	{
		if(helper == null)
			helper = new ProducerHelper();
		return helper;
	}
	
	public static ProducerHelper getHelper(String configFilePath)
	{
		if(helper == null)
		  helper = new ProducerHelper(configFilePath);
		return helper;
	}
	
	//To support setup configuration at code level
	/*
	private static ProducerHelper getHelper(ProducerContext ctx)
	{
		if(helper == null)
		  helper = new ProducerHelper(ctx);
		return helper;
	}*/
	
	public DataQueue getQueue(String topic)
	{
		if(queues.get(topic)!= null)
			return queues.get(topic);
		
		return null;
	}
	
	public DataQueue getQueue()
	{
		if(queues.size()>0)
			return queues.values().iterator().next();
		
		return null;
	}
	
	public boolean sendQueue(DataQueue queue)
	{
		boolean result = channel.send(MessageBuilder.withPayload(queue.getMessage()).setHeader("messageKey", queue.hashCode()).setHeader("topic", queue.getQueueName()).build());
//		
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		return result;
	}
	
	public Collection<DataQueue> getQueueList()
	{
		return queues.values();		
	}
	
	//To support send batch queues
	@SuppressWarnings("unused")
	private void sendQueues(List<DataQueue> queues)
	{		
	}  
	
	@Override
	public void finalize()
	{
		ctx.close();
	}
	
	
}
