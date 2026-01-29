package linked_list;

public class SinglyLinkedList {
	private ListNode head;

	private static class ListNode {
		private int data;
		private ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void printList() {
		ListNode current = head;
		if (current == null) {
			System.out.println("list is emty");
		} else {
			while (current != null) {
				System.out.print(current.data + "-->");
				current = current.next;
			}
			System.out.println("null");
		}
	}

	public int findLenth() {
		if (head == null) {
			return 0;
		} else {
			ListNode temp = head;
			int lenth = 1;
			while (temp.next != null) {
				temp = temp.next;
				lenth++;
			}
			return lenth;
		}
	}

	public void insertFirst(int data) {
		ListNode newNode = new ListNode(data);
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void removeFirst() {
		if (head == null) {
			return;
		}
		ListNode current = head;
		head = head.next;
		current.next = null;
	}

	public void insertLast(int data) {
		ListNode newNode = new ListNode(data);
		if (head == null) {
			head = newNode;
		} else {
			ListNode current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	public void removeLast() {
		if (head == null) {
			return;
		} else {
			ListNode current = head;
			while (current.next.next != null) {
				current = current.next;
			}
			current.next = null;
		}
	}

	public void searchKey(int key) {
		if (head == null) {
			return;
		} else {
			ListNode temp = head;
			if (temp.data == key) {
				System.out.println("key present in first position");
			}
			while (temp != null) {
				if (temp.data == key) {
					System.out.println("you enterd key present");
				}
				temp = temp.next;
			}
		}
	}

	public void insertAtPosition(int position, int data) {
		ListNode newnode = new ListNode(data);
		if (position == 1) {
			newnode.next = head;
			head = newnode;
		} else {
			ListNode previes = head;
			int count = 1;
			while (count < position - 1) {
				previes = previes.next;
				count++;
			}

			ListNode current = previes.next;
			previes.next = newnode;
			newnode.next = current;
		}
	}

	public void deleteAtPosition(int position) {
		if (position == 1) {

			head = head.next;

		} else {
			ListNode previes = head;
			int count = 1;
			while (count < position - 1) {
				previes = previes.next;
				count++;
			}
			ListNode current = previes.next.next;
			previes.next = current;

		}
	}

	public ListNode reverceList() {
		if (head == null) {
			return null;
		} else {
			ListNode current = head;
			ListNode next = null;
			ListNode previes = null;
			while (current != null) {
				next = current.next;
				current.next = previes;
				previes = current;
				current = next;
			}
			return previes;
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

	public ListNode findNthNodeFromEnd(int n) {
		if (head == null) {
			return null;
		}
		if (n <= 0) {
			throw new IllegalArgumentException("Invalid value: n = " + n);
		}
		ListNode mainPtr = head;
		ListNode refPtr = head;
		int count = 0;
		while (count < n) {
			refPtr = refPtr.next;
			count++;
		}
		while (refPtr != null) {
			refPtr = refPtr.next;
			mainPtr = mainPtr.next;
		}
		return mainPtr;
	}

	public void insertInSortedList(int data) {
		ListNode newNode = new ListNode(4);
		if (head == null) {
			head = newNode;
		}
		ListNode current = head;
		ListNode temp = null;
		while (current != null && current.data < newNode.data) {
			temp = current;
			current = current.next;
		}
		newNode.next = current;
		temp.next = newNode;
	}

	public void delete(int key) {
		if (head == null) {
			System.out.println("list is empty");
		}
		ListNode current = head;
		ListNode temp = null;
		if (current.data == key) {
			head = current.next;
		}

		while (current != null && current.data != key) {
			temp = current;
			current = current.next;
		}
		if (current == null) {
			return;
		}
		temp.next = current.next;

	}

	public boolean containsLoop() {
		if (head == null) {
			System.out.println("the list is empty");
		}
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		while (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if (fastPtr == slowPtr) {
				return true;
			}
		}
		return false;
	}

	public ListNode startingNodeInAloop() {
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		while (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if (fastPtr == slowPtr) {
				return getStartingNode(slowPtr);
			}
		}
		return null;
	}

	public ListNode getStartingNode(ListNode slowptr) {
		ListNode temp = head;
		if (temp != slowptr) {
			temp = temp.next;
			slowptr = slowptr.next;
		}
		return temp;

	}

	public void removeLoop() {
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		while (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			if (slowPtr == fastPtr) {
				removeLoop(slowPtr);
				return;
			}
		}
	}

	public void removeLoop(ListNode slowPtr) {
		ListNode temp = head;
		while (temp.next != slowPtr.next) {
			temp = temp.next;
			slowPtr = slowPtr.next;
		}
		slowPtr.next = null;
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