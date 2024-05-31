import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LQueueTest {

	LQueue q;
	@Before
	public void setup()
	{
		q = new LQueue();
	}

	/*
	 * 2: complete the following test methods as specified. 
	 */

	@Test
	public void testIsEmpty() {
		// test that q.isEmpty returns true
		q.isEmpty();
	}

	@Test
	public void testIsEmptyFalse() {
		// add an element to the queue "q"
		q.enqueue("A");
		// then test that q is not an empty queue.
		q.isEmpty();
	}

	@Test
	public void testSizeEmpty() {
		// test the size of an empty queue is 0
		q.size();
		assertEquals(0, q.size());
	}

	@Test
	public void testSizeNonEmpty() {
		// add an element(s) to the queue
		q.enqueue("s");

		// then test the size of the queue
		assertEquals(1, q.size());
	}

	@Test
	public void testEnqueue() {
        q.enqueue("A");
		assertEquals("A",q.dequeue());
	}

	@Test
	public void testDequeue() {
		// enqueue multiple elements to the queue
		q.enqueue("A");
		q.enqueue("B");
		assertEquals("A",q.dequeue());
		assertEquals("B",q.dequeue());
	}

	@Test(expected = QueueException.class)  
	public void testEmptyDequeue() {
		// try to dequeue an empty queue
		q.dequeue();
		throw new QueueException(null);
	}

	@Test(expected = QueueException.class)  
	public void testEmptyFront() {
		// try to get the front value of an empty queue
		q.front();
		throw new QueueException(null);
	}
}
