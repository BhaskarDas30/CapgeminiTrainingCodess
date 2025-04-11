package Stack;

import LinkedList.SinglyLinkedList;

public class StackUsingLinkedList {
	private SinglyLinkedList list;
	private int pointer = -1;
	public StackUsingLinkedList() {
		list = new SinglyLinkedList();
	}
	public boolean push(int value) {
		pointer++;
//		return list.append(value);
		return list.prepend(value);
	}
	public boolean isEmpty() {
		return pointer==-1;
	}
	public int pop() {
		if(isEmpty()) {
			throw new IndexOutOfBoundsException();
		}
//		int data=list.get(pointer);
//		pointer--;
		int data=list.get(0);
		list.deleteAtFirst();
		return data;
	}
	public int peek() {
		return list.get(0);
	}
	public void display() {
		list.display();
	}
}
