package stack;

class Stack<T> {
	ListNode top;
	int length;

public class ListNode {
		T data;
		ListNode next;

		public ListNode(T data) {
			this.data = data;
			this.next = null;
		}

		@Override
		public String toString() {
			return "ListNode [data=" + data + ", next=" + next + "]";
		}

	}

	private int size() {
		return length;
	}

	private boolean isEmpty() {
		return length == 0;
	}

	private void push(T value) {
		ListNode newNode = new ListNode(value);
		newNode.next = top;
		top = newNode;
		length++;
	}

	private T pop() {
		if (top == null) {
			throw new IllegalStateException("Stack is empty. Cannot pop.");
		}
		T returnValue = top.data;
		top = top.next;
		length--;
		return returnValue;
	}

	private T peak() {
		if (top == null) {
			throw new IllegalStateException("Stack is empty. Cannot pop.");
		}
		return top.data;
	}

	private void display() {
		if (top == null) {
			System.out.println("the stack is empty...");
		}
		ListNode current = top;

		while (current != null) {
			System.out.println(" -> " + current.data);
			current = current.next;

		}
		System.out.println(" null ");
	}

	private boolean contains(T value) {
		if (top == null) {
			System.out.println("the stack is empty...");
		}
		ListNode current = top;
		while (current != null) {
			if (current.data == value) {
				return true;
			}
		}
		return false;
	}

	private void clear() {
		top = null;
		length = 0;
	}

	private int search(T  value) {
		if (top == null) {
			System.out.println("the stack is empty...");
			return 0;
		}
		int len = 1;
		ListNode current = top;
		while (current != null) {
			if (current.data == value) {
				return len;
			}
			current = current.next;
			len++;
		}
		return len;
	}
}