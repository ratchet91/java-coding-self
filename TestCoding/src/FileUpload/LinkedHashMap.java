package FileUpload;

public class LinkedHashMap {
	static class Node {
		int key;
		int value;
		Node next;
		Node prev;

		Node(int key, int val) {
			this.key = key;
			this.value = val;
			this.next = null;
			this.prev = null;
		}

	}

	Node head = new Node(0, 0);
	Node tail = new Node(0, 0);head.next=tail;tail.prev=head;
	Node current = head;

	// 1. -> to have 2 diff hashMap -> 1 Map<Integer, Node>
	Map<Integer, Node> keyVsNodeMap = new HashMap<>();

	public static void putEntry(int key int value) {
		Node newEnrty = new Node(key,value);
		keyVsNodeMap.put(key,newEnrty);
		if(current == head) {
			head.next = current;
		}
		if(root != null) {
			root.next = newEntry;
			newEnrty.prev = root;
			root = root.next;
			tail.prev = newEntry;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
