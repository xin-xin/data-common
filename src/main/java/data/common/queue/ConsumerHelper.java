package data.common.queue;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.integration.kafka.support.ConsumerConfiguration;
import org.springframework.integration.kafka.support.KafkaConsumerContext;
import org.springframework.messaging.Message;

public class ConsumerHelper 
{
	private static ConsumerHelper helper = null;
	
	private static final String CONFIG = "/inbound-kafka-default.xml";
	
	private byte[] prefix= new byte[]{-84, -19, 0, 5, 116, 0};
	private byte[] receivedPrefix = new byte[prefix.length];
	private HashMap<String, DataQueue> queues = new HashMap<String,DataQueue>();
	
	private QueueChannel channel = null;
	private ClassPathXmlApplicationContext ctx = null;
	
	//init producer helper
	//init message channel
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private ConsumerHelper()
	{
		ctx = new ClassPathXmlApplicationContext(CONFIG, ConsumerHelper.class);
		ctx.start();
		
		channel = ctx.getBean("inputFromKafka", QueueChannel.class);  
		
		KafkaConsumerContext kfkCtx = (KafkaConsumerContext)ctx.getBean("consumerContext");
		
		DataQueue queue = null;
		for(Object cfgObj: kfkCtx.getConsumerConfigurations().values())
		{
			queue = new DataQueue(this);
			
			ConsumerConfiguration cfg = (ConsumerConfiguration)cfgObj;
 
			Map<String,String> topicStream = cfg.getConsumerMetadata().getTopicStreamMap();
			for(String topic :topicStream.keySet())
			{			
				queue.setQueueName(topic);
				queues.put(queue.getQueueName(), queue);
				//break;
			} 
		}
		 
	}
	
	private ConsumerHelper(ConsumerContext ctx)
	{
		//change message channel
	}
	
	private ConsumerHelper(String configFilePath)
	{
		if(ctx != null)
		{
			ctx.close();
		}
		ctx = new ClassPathXmlApplicationContext(configFilePath, ConsumerHelper.class);
		
		ctx.start();
	}
	
	public static ConsumerHelper getHelper()
	{
		if(helper == null)
			helper = new ConsumerHelper();
		return helper;
	}
	
	//To support setup configuration at code level
	/*
	private static ConsumerHelper getHelper(ConsumerContext ctx)
	{
		if(helper == null)
		  helper = new ConsumerHelper(ctx);
		return helper;
	}
	*/
	
	public static ConsumerHelper getHelper(String configFilePath)
	{
		if(helper == null)
		  helper = new ConsumerHelper(configFilePath);
		return helper;
	}
	
	public DataQueue getQueue(String topic)
	{
		if(queues.get(topic)!= null)
			return queues.get(topic);
		
		return null;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void receiveQueue(DataQueue queue)
	{		
		Message msg;		
		while((msg = channel.receive()) != null) {
			HashMap map = (HashMap)msg.getPayload();
			Set<Map.Entry> set = map.entrySet();
			for (Map.Entry entry : set) {
				String topic = (String)entry.getKey();
				
				boolean sameTopic = false;				
				if(queue.getQueueName().equals(topic))
				{
					sameTopic=true;					
				}				
				ConcurrentHashMap<Integer,List<byte[]>> messages = (ConcurrentHashMap<Integer,List<byte[]>>)entry.getValue();
				Collection<List<byte[]>> values = messages.values();
				for (Iterator<List<byte[]>> iterator = values.iterator(); iterator.hasNext();) {
					List<byte[]> list = iterator.next();
					for (byte[] object : list) {
						
						if(sameTopic)
						{							
							System.arraycopy( object, 0, receivedPrefix, 0, 6 );
							if(Arrays.equals(prefix, receivedPrefix))
							{								
								byte[] msgObj = new byte[object.length -7];
								System.arraycopy( object, 7, msgObj, 0, object.length -7 );
								queue.addReceivedMessage( new String(msgObj));
							}
							else
							{
								queue.addReceivedMessage( new String(object));
							}
						}
					}
					
				}
				
				return;
			}			
			
		}
		
		/*
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		*/
	}
	
	public List<DataQueue> getQueueList()
	{
		return null;		
	}
	
	public void sendQueues(List<DataQueue> queues)
	{
		
	}  
	
	@Override
	public void finalize()
	{
		ctx.close();
	}
	
	
}