public class LSearch {


	private class Node {
		private Entry value;
		private Node nextNode;

		public Node(Entry v) {
			value = v;
			nextNode = null;
		}

		public Entry getValue() {
			return value;
		}

		public Node getNextNode() {
			return nextNode;
		}

		// Sets the NextNode to the given Node
		public void setNextNode(Node n) {
			nextNode = n;
		}
	}

	// Holds a reference to the head of the list
	private Node headNode;

	public LSearch() {
		headNode = null;
	}

	public void addAtHead(Entry e) {
		Node newNode = new Node(e); 
		newNode.setNextNode(headNode); 
		headNode = newNode; 
	}

	/*
	 * Part 3: complete
	 */	
	public int linearSearch(String name){

		Node node = headNode;
		while (node != null) 
		{ 
			if (node.getValue().getName().equals(name)) {
				return node.getValue().getNumber();
			}
			node = node.getNextNode(); 

		}
		return -1;
	}
}

