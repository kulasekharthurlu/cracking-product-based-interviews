package top_patterns.fast_and_slow_pointers;

public class FindMiddleOfLinkedList {
	public ListNode middleNode(ListNode head) {
		ListNode slow = head, fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

}