import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import data.common.queue.ConsumerHelper;
import data.common.queue.DataQueue;
import data.common.queue.ProducerHelper;

public class QueueTester {

	@Test
	public void testBlockQueue(){
		
		String msg = "unit ######abc########1234567890-1234567890### test";
		 
		DataQueue outQueue = ProducerHelper.getHelper().getQueue("event-stream");
		boolean result = outQueue.push(msg);
		
		assertTrue("Success push to queue.", result); 
		DataQueue inQueue = ConsumerHelper.getHelper().getQueue("event-stream");
 
		List<String> received = inQueue.poll();
		for (String remsg : received) {
			assertEquals("Should be same", msg, remsg);
		} 
		
		
	}

}
