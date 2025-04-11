package Queue;

public class Driver {
	public static void main(String[] args) {
//		QueueUsingArray queue=new QueueUsingArray();
//		queue.insert(10);
//		queue.insert(20);
//		queue.insert(30);
//		queue.display();
//		queue.delete();
//		queue.display();
		QueueUsingLinkedList queue=new QueueUsingLinkedList();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.display();
		queue.dequeue();
		queue.display();
		queue.enqueue(5);
		queue.display();
	}
}
