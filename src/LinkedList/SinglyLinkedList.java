package LinkedList;

public class SinglyLinkedList {
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
//	time complexity - O(1)
	public boolean append(int value) {
		Node node=new Node(value);
		if(isEmpty()) {
			head=node;
			tail=node;
		}
		else {
			tail.next=node;			
			tail=node;
		}
		size++;
		return true;
	}
//	time complexity - O(1)
	public boolean prepend(int value) {
		Node node=new Node(value);
		if(isEmpty()) {
			head=node;
			tail=node;
		}
		else {
			node.next=head;
			head=node;
		}
		size++;
		return true;
	}
//	time complexity - O(n)
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
			size++;
			return true;
		}
	}
//	time complexity - O(1)
	public boolean deleteAtFirst() {
		if(isEmpty()) {
			return false;
		} else if(head==tail) {
			head = null;
			tail=null;
		} else {
			head=head.next;
		}
		size--;
		return true;
	}
//	time complexity - O(n)
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
			tail.next=null;
		}
		size--;
		return true;
	}
//	time complexity - O(n)
	public boolean deleteAtIndex(int index) {
		if(isEmpty()) {
			return false;
		} else if(head==tail) {
			head = null;
			tail=null;
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
	public int getSize() {
		return size;
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
	public boolean reverse() {
		if(isEmpty()) {
			return false;
		} else {
			Node prev=null;
			Node next=null;
			Node current=head;
			tail=head;
			while(current != null) {
				next=current.next;
				current.next=prev;
				prev=current;
				current=next;
			}
			head=prev;
			display();
		}
		return true;
	}
//	time complexity - O(n)
	public int search(int value) {
		Node temp=head;
		int i=0;
		while(temp!=null) {
			if(temp.value == value) {
				return i;
			}
			temp=temp.next;
			i++;
		}
		return -1;
	}
	public int get(int index) {
		if(index<0 || index>=size) {
			throw new IndexOutOfBoundsException();
		} else {
			Node temp=head;
			int i=0;
			while(i!=index) {
				temp=temp.next;
				i++;
			}
			return temp.value;
		}
	}
//	time complexity - O(n)
	public void display() {
		Node temp=head;
		StringBuffer sb= new StringBuffer("[ ");
		while(temp != null) {
			sb.append(temp == tail ? temp.value : temp.value + " -> ");
			temp=temp.next;
		}
		sb.append(" ]");
		System.out.println(sb);
	}
}
