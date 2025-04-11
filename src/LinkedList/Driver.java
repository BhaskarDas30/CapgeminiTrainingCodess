package LinkedList;

public class Driver {
	public static void main(String[] args) {
//		SinglyLinkedList list=new SinglyLinkedList();
//		list.append(10);
//		list.append(20);
//		list.append(30);
//		System.out.println(list.search(50));
		SinglyLinkedList list=new SinglyLinkedList();
		list.append(10);
		list.append(20);
		list.append(30);
//		list.prepend(5);
//		list.insertAtIndex(60, 2);
//		list.deleteAtFirst();
//		list.deleteAtLast();
//		list.deleteAtIndex(1);
//		list.update(15, 1);
		list.display();
//		System.out.println(list.search(30));
//		list.reverse();
//		list.reversedisplay();
		System.out.println(list.get(2));
}
}