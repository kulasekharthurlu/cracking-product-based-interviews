package linked_list;

public class DoublyLinkedList {

	ListNode head;
	ListNode tail;
	int lenth;

	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.lenth = 0;
	}

	private class ListNode {
		int data;
		ListNode next;
		ListNode previes;

		public ListNode(int data) {
			this.data = data;
		}
	}

	public boolean isEmty() {
		return lenth == 0;
	}

	public int lenth() {
		return lenth;
	}

	public void insertFirst(int value) {
		ListNode newNode = new ListNode(value);
		if (isEmty()) {
			tail = newNode;
		} else {
			head.previes = newNode;
		}
		newNode.next = head;
		head = newNode;
		lenth++;
	}

	public void insertLast(int value) {
		ListNode newNode = new ListNode(value);
		if (isEmty()) {
			head = newNode;

		} else {
			tail.next = newNode;
			newNode.previes = tail;

		}
		tail = newNode;
		lenth++;
	}

	public void displayForword() {
		if (head == null) {
			return;
		} else {
			ListNode temp = head;
			while (temp != null) {
				System.out.print(temp.data + "-->");
				temp = temp.next;
			}
			System.out.println("null");
		}
	}

	public void displayBackword() {
		if (tail == null) {
			return;
		} else {
			ListNode temp = tail;
			while (temp != null) {
				System.out.print(temp.data + "-->");
				temp = temp.previes;
			}
			System.out.println("null");
		}
	}

	public ListNode deleteFirst() throws Exception {
		if (isEmty()) {
			throw new Exception();
		}

		ListNode temp = head;
		if (head == tail) {
			tail = null;
		} else {
			head.next.previes = null;

		}
		head = head.next;
		temp.next = null;
		return temp;
	}

	public ListNode deleteLastNode() throws Exception {
		if (isEmty()) {
			throw new Exception();
		}

		ListNode temp = tail;
		if (tail == head) {
			head = null;

		} else {
			temp.previes.next = null;
		}
		tail = tail.previes;
		temp.previes = null;
		return temp;
	}

	public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.insertFirst(2);
		dll.insertLast(12);
		System.out.println(dll.lenth);
		System.out.println(dll.isEmty());
		try {
			ListNode deleteNode = dll.deleteLastNode();
			System.out.println("daleted node is : null<--" + deleteNode.data + "-->null");

		} catch (Exception e1) {
			e1.printStackTrace();
		}

		try {
			ListNode deleteNode = dll.deleteFirst();
			System.out.println("daleted node is : null<--" + deleteNode.data + "-->null");
		} catch (Exception e) {

			e.printStackTrace();
		}

		dll.displayForword();
		dll.displayBackword();

	}

}