package recursion;

 

public class LinkedList{
	 
    public ListNode reverceListWithRecursion(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode newHead = reverceListWithRecursion(head);
		head.next.next = head;
		head.next = null;
		return newHead;
	}
}
  class ListNode {
	public  int data;
	public ListNode next;

	public ListNode(int data) {
		this.data = data;
		this.next = null;
	}
}