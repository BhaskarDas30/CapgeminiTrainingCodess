package LinkedList;

public class Driver {
	public static void main(String[] args) {
		SinglyLinkedList list=new SinglyLinkedList();
		list.append(10);
		list.append(20);
		list.append(30);
		list.prepend(5);
		list.insertAtIndex(15, 2);
		list.deleteAtFirst();
		list.deleteAtIndex(2);
		int size=list.getSize();
		list.display();
		System.out.println(size);
		list.update(50, 2);
		list.display();
		list.reverse();
	}
}
