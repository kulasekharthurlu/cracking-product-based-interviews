package doubly_linked_list;

public class CreateDLL {

	private ListNode head;
	private ListNode tail;
	private int length;

	private class ListNode {

		private int data;
		private ListNode next;
		private ListNode prev;

		public ListNode(int data) {
			this.data = data;
		}
	}

	public CreateDLL() {
		this.head = null;
		this.tail = null;
		this.length = 0;
	}

	public boolean isEmpty() {
		return this.length == 0;
	}

	public int size() {
		return length;
	}

	public void createDoublyLinkedList() {
		ListNode first = new ListNode(10);
		ListNode second = new ListNode(21);
		ListNode third = new ListNode(78);
		ListNode fourth = new ListNode(91);
		ListNode fifth = new ListNode(12);
		ListNode sixth = new ListNode(90);

		this.head = first;
		this.head.next = second;
		this.head.prev = null;
		second.next = third;
		second.prev = first;
		third.next = fourth;
		third.prev = second;
		fourth.next = fifth;
		fourth.prev = third;
		fifth.next = sixth;
		fifth.prev = fourth;
		sixth.next = null;
		sixth.prev = fifth;
		this.tail = sixth;
		this.length = 6;
	}

	public void displyForward() {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + "-->");
			current = current.next;
		}
		System.out.println("null");
	}
}