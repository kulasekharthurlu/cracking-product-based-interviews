package top_patterns.fast_and_slow_pointers;

public class FindStartOfCycle {
	public ListNode detectCycle(ListNode head) {
		ListNode slow = head, fast = head;

		// Detect cycle
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				slow = head;

				while (slow != fast) {
					slow = slow.next;
					fast = fast.next;
				}
				return slow;
			}
		}
		return null;
	}

}