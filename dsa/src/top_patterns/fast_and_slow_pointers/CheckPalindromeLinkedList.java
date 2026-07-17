package top_patterns.fast_and_slow_pointers;

public class CheckPalindromeLinkedList {
	public boolean isPalindrome(ListNode head) {
		ListNode slow = head, fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		// reverse second half
		ListNode prev = null;
		while (slow != null) {
			ListNode next = slow.next;
			slow.next = prev;
			prev = slow;
			slow = next;
		}

		// compare
		ListNode left = head, right = prev;
		while (right != null) {
			if (left.val != right.val)
				return false;
			left = left.next;
			right = right.next;
		}
		return true;
	}

}

class ListNode {
	int val;
	ListNode next;

	public ListNode(int data) {
		this.val = data;
		this.next = null;
	}
}