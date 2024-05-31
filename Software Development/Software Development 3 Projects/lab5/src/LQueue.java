public class LQueue {

	private class Node{
		Object element;
		Node next;

		public Node(Object e, Node n){
			element = e;
			next = n;
		}

		public Node(Object e){
			element = e;
			next = null;
		}
	}

	private Node head;
	private Node tail;
	private int size;

	public LQueue(){
		head = null;
		tail = null;	
	}

	/*
	 * Part 3: complete the following methods
	 */

	// Part 3: complete	
	public boolean isEmpty(){
		return head == null;
	}

	// Part 3: complete
	public int size(){
		return size; 
	}

	// Part 3: complete
	public void enqueue(Object o){
		Node temp = new Node(o);
		if (size == 0){
			head = temp;
		}
		else {
			tail.next = temp;
		}
		tail = temp;
		size++;
	}

	// Part 3: complete	
	public Object dequeue() throws QueueException{

		if (head == null)
			return null;

		Node temp = head;
		head = head.next;
		size--;

		if (size == 0){
			tail = null;
		}
		return temp.element;
		
	}

	// Part 3: complete
	public Object front() throws QueueException{
		if (isEmpty());
		throw new QueueException ("Queue is empty.");
	}

}
