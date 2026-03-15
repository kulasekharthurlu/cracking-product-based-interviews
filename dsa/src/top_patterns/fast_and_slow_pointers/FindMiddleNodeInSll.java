package linked_list;

import java.util.HashSet;
import java.util.Set;

public class FindMiddleNodeInSll {
	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}
 
 public ListNode findMiddleNode() {
		if (head == null) {
			return null;
		} else {
			ListNode fastPtr = head;
			ListNode slowptr = head;
			while (fastPtr != null && fastPtr.next != null) {
				slowptr = slowptr.next;
				fastPtr = fastPtr.next.next;
			}
			return slowptr;
		}
	}	 
	public static void main(String[] args) {
		SinglyLinkedList sll = new SinglyLinkedList();
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(5);

		sll.head = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		sll.printList();
	}

}