package main;

public class LinkedLists {

	public static class Nodes {
		int data;
		Nodes next;

		// Nodes prev;
		Nodes(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static Nodes head = null;

	public static void insertNodes(int val) {
		Nodes temp = new Nodes(val);
		if (head == null) {
			head = temp;
			return;
		}
		Nodes t = head;
		for (; t.next != null; t = t.next)
			;
		t.next = temp;
	}

	public static void printNodes() {
		Nodes temp = head;
		for (; temp != null; temp = temp.next) {
			if (temp != head) {
				System.out.print(" -> ");
			}
			System.out.print(temp.data);
		}
	}

	public static int delete(int val) {
		Nodes temp = head;
		Nodes temp2 = null;
		int flag = -1;
		for (; temp != null; temp = temp.next) {
			if (temp.data == val) {
				flag = 1;
				temp2.next = temp.next;
				break;
			} else {
				temp2 = temp;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 1, 2, 4, 6, 3, 21 };

		for (int i = 0; i < arr.length; i++) {
			insertNodes(arr[i]);
		}
		printNodes();
		int f = delete(46);
		System.out.println("");
		if (f != -1) {
			printNodes();
		} else {
			System.out.print("value for deletion : " + 46 + " not present");
		}

	}

}
