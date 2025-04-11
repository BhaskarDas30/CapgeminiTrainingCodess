package Queue;

import LinkedList.SinglyLinkedList;

public class QueueUsingLinkedList {
	private SinglyLinkedList list;
	public QueueUsingLinkedList() {
		list=new SinglyLinkedList();
	}
	public boolean enqueue(int value) {
		return list.append(value);
	}
	public boolean dequeue() {
		return list.deleteAtFirst();
	}
	public void display() {
		list.display();
	}
}
