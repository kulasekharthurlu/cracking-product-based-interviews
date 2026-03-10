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
	
	public void display() {
		
		if(last == null) {
			return;
		}
		ListNode first=last.next;
		while(first != last) {
			System.out.print(first.data+"-->");
			first=first.next;
		}
		System.out.print(first.data+"--> null");
	}
	
	public void insertFirst(int value) {
		ListNode newNode=new ListNode(value);
		
		if(last == null) {
			last=newNode;
		}else {
			newNode.next=last.next;
		}
		last.next=newNode;
		length++;
	}
	public void insertLast(int value) {
		ListNode newNode=new ListNode(45);
		if(last == null) {
			last=newNode;
		}else {
			
		}
	}
	
	public ListNode removeFirst() throws Exception {
		
		if(isEmty()) {
			throw new Exception("Circular singly linked list is already empty");
		}
		ListNode temp=last.next;
		if(last.next == last) {
			last=null;
		}else {
			last.next=temp.next;
		}
		temp.next=null;
		length--;
		return temp;
	}
	
	/*
	 * public ListNode removeLast() throws Exception { if(last == null) { throw new
	 * Exception("Circular linked list is already emty"); }
	 * 
	 * ListNode temp=last.next; if(last.next == last) { last=null; }else {
	 * while(temp.next != last) { temp=temp.next; } temp.next.next=last; last=temp;
	 * length--; }
	 * 
	 * return last; }
	 */
	
	public static void main(String[] args) {
		CirculaLinkedList cll=new CirculaLinkedList();
		cll.createCircularLinkedList();
		cll.insertFirst(34);
		try {
			cll.removeFirst();
		} catch (Exception e) {
		 
			e.printStackTrace();
		}
		 
		cll.display();
		
	}
}