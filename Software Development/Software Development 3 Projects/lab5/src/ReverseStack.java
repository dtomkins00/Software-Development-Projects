public class ReverseStack {


	/*
	 * 1: complete implementation
	 */
	public static void reverseStack(Stack st){
		Queue q = new Queue();
		while(!st.isEmpty())
		{
			q.enqueue(st.pop());
		}

		while(!q.isEmpty())
		{
			st.push(q.dequeue());
		}
	}
}
