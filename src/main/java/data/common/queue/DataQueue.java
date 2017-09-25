package data.common.queue;

import java.util.ArrayList;
import java.util.List;

public class DataQueue 
{
	private ProducerHelper pHelper = null;
	private ConsumerHelper cHelper = null;
	
	private String name;
	private String message;
	
	
	DataQueue(ProducerHelper helper)
	{
		pHelper = helper;
	}
	DataQueue(ConsumerHelper helper)
	{
		cHelper = helper;
	}
	
	public String getQueueName()
	{
		return name; 
	}
	
	void setQueueName(String name)
	{
		this.name = name;
	}
	
	public String getMessage()
	{
		return message;
	}
	
	void setMessage(String message)
	{
		this.message = message;
	}
	
	public boolean push(String message)
	{
		synchronized(this)
		{
			setMessage(message);
			if(pHelper != null)
			{
				return pHelper.sendQueue(this);
			}		
			return false;
		}
	}
	
	 
	//message receiving related attribute and method
	private ArrayList<String> receivedMessages = new ArrayList<String>();
	
	void addReceivedMessage(String message)
	{
		receivedMessages.add(message);
	}
	public List<String> poll()
	{
		if(cHelper == null)
			return null;
		
		synchronized(this)
		{
			cHelper.receiveQueue(this);
			return receivedMessages;
		}
	}

}
