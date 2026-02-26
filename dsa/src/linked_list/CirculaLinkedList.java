
package linked_list;

public class CirculaLinkedList {
 private ListNode last;
 private int length;
 
 public CirculaLinkedList() {
	 this.last=null;
	 this.length=0;
 }
	
	private class ListNode{
		private ListNode next;
		private int data;
		
		 public  ListNode(int data){
			this.data=data;
		}
	}
	
	public int length() {
		return length;
	}
	
	public boolean isEmty() {
		return length == 0;
	}
	
	public ListNode createCircularLinkedList() {
		ListNode first=new ListNode(1);
		ListNode second=new ListNode(2);
		ListNode third=new ListNode(3);
		ListNode fourth=new ListNode(4);
		
		first.next=second;
		second.next=third;
		third.next=fourth;
		fourth.next=first;
		last=fourth;
		return last;
		
	}
}