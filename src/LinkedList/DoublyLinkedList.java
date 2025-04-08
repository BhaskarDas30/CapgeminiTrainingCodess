package LinkedList;

public class DoublyLinkedList {
	private Node head;
	private Node tail;
	private int size;
	private class Node {
		int value;
		Node next;
		Node prev;
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
		} else {
			tail.next=node;
			node.prev=tail;
			tail=node;
		}
		size++;
		return true;
	}
	public boolean prepend(int value) {
		Node node=new Node(value);
		if(isEmpty()) {
			head=node;
			tail=node;
		} else {
			node.next=head;
			node.prev=null;
			head=node;
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
			node.prev=prev;
			node.next=temp;
			temp.prev=node;
			size++;
			return true;
		}
	}
	public boolean deleteAtFirst() {
		if(isEmpty()) {
			return false;
		} else if(head==tail) {
			head = null;
			tail=null;
		} else {
			head=head.next;
			head.prev=null;
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
			Node prev=null;
			while(temp.next!=null) {
				prev=temp;
				temp=temp.next;
			}
			tail.prev=prev;
			prev.next=null;
			tail=prev;
		}
		size--;
		return true;
	}
	public boolean deleteAtIndex(int index) {
		if(isEmpty()) {
			return false;
		} else if(index==0) {
			return deleteAtFirst();
		} else if(index==size-1) {
			return deleteAtLast();
		} else {
			Node temp=head;
			int i=0;
			while(i<index-1) {
				temp=temp.next;
				i++;
			}
			temp.next=temp.next.next;
			temp.next.prev=temp;
		}
		size--;
		return true;
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
	public void reversedisplay() {
		Node temp=tail;
		while(temp!=null) {
			System.out.print(temp.value+" ");
			temp=temp.prev;
		}
	}
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
