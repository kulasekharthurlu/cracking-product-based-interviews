package queue;

import java.util.NoSuchElementException;

public class Queue {
        private ListNode front;
        private ListNode rear;
        private int length;


        @Override
        public String toString() {
                return "Queue [front=" + front + ", rear=" + rear + ", length=" + length + "]";
        }

        private class ListNode {
                private ListNode next;
                private int data;

                public ListNode(int data) {
                        this.data = data;
                        this.next = null;
                }

                @Override
                public String toString() {
                        return "ListNode [next=" + next + ", data=" + data + "]";
                }

        }

        public Queue() {
                this.front = null;
                this.rear = null;
                this.length = 0;
        }

        public int length() {
                return length;
        }

        public boolean isEmty() {
                return length == 0;
        }

        public void enqueue(int data) {
                ListNode newNode = new ListNode(data);
                if (isEmty()) {
                        front = newNode;
                } else {
                        rear.next = newNode;
                }
                rear = newNode;
                length++;
        }

        public int dequeue() {
                int result = 0;
                if (isEmty()) {
                        throw new NoSuchElementException("Queue is already empty");
                } else {
                        result = front.data;
                        front = front.next;
                        if (front == null) {
                                rear = null;
                        }
                }
                return result;
        }

        public void displayQueue() {
                ListNode temp=front;
                if(isEmty()) {
                        throw new NoSuchElementException("Queue is already empty");
                }else {
                        while(temp != null) {
                                System.out.print(temp.data+" -->");
                                temp=temp.next;
                        }
                        System.out.println("null");
                }
        }



}