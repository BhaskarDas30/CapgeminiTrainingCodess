package LinkedList;

public class CircularLinkedList {
	private Node head;
	private Node tail;
	private int size=0;
	private class Node {
		int value;
		Node next;
		Node(int value) {
			this.value=value;
		}
	}
	public boolean isEmpty() {
		return (head==null && tail==null);
	}
	public boolean append(int value) {
		Node node=new Node(value);
		if(isEmpty()) {
			head=node;
			tail=node;
			tail.next=head;
		} else {
			tail.next=node;
			tail=tail.next;
			tail.next=head;
		}
		size++;
		return true;
	}
	public boolean prepend(int value) {
		Node node=new Node(value);
		if(isEmpty()) {
			head=node;
			tail=node;
			tail.next=head;
		} else {
			node.next=head;
			head=node;
			tail.next=head;
		}
		size++;
		return true;
	}
	public boolean insertAtIndex(int value, int index) {
		if(index<=0) {
			return prepend(value);
		}
		else if(index>size) {
			return append(index);
		} else {
			Node node = new Node(value);
			Node temp=head;
			Node prev=null;
			int i=0;
			while(i!=index) {
				prev=temp;
				temp=temp.next;
				i++;
			}
			prev.next=node;
			node.next=temp;
		}
		size++;
		return true;
	}
	public boolean deleteAtFirst() {
		if(isEmpty()) {
			return false;
		} else if(head==tail) {
			head = null;
			tail=null;
		} else {
			head=head.next;
			tail.next=head;
		}
		size--;
		return true;
	}
	public boolean deleteAtLast() {
		if(isEmpty()) {
			return false;
		} else if(head==tail) {
			head = null;
			tail=null;
		} else {
			Node temp=head;
			while(temp.next!=tail) {
				temp=temp.next;
			}
			tail=temp;
			tail.next=head;
		}
		size--;
		return true;
	}
	public boolean deleteAtIndex(int index) {
		if(isEmpty()) {
			return false;
		} else if(head==tail) {
			head = null;
			tail = null;
		} else {
			Node temp=head;
			int i=0;
			while(i<index-1) {
				temp=temp.next;
				i++;
			}
			temp.next=temp.next.next;
		}
		size--;
		return true;
	}
	public int search(int value) {
		Node temp=head;
		int i=0;
		do {
			if(temp.value == value) {
				return i;
			}
			temp=temp.next;
			i++;
		} while(temp!=head);
		return -1;
	}
	public boolean update(int value, int index) {
		Node temp=head;
		int i=0;
		while(i!=index) {
			temp=temp.next;
			i++;
		}
		temp.value=value;
		return true;
	}
	public void display() {
		if(isEmpty()) 
			return;
		Node temp=head;
		StringBuffer sb= new StringBuffer("[ ");
		do {
			sb.append(temp == tail ? temp.value : temp.value + " -> ");
			temp=temp.next;
		} while(temp != head);
//		sb.append(temp.value);
		sb.append(" ↩ ]");
		System.out.println(sb);
	}
}
