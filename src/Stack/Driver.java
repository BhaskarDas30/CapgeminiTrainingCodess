package Stack;

public class Driver {
	public static void main(String[] args) {
//		StackUsingArray stack=new StackUsingArray();
//		stack.push(10);
//		stack.push(20);
//		stack.push(30);
//		stack.push(40);
//		stack.push(50);
//		stack.display();
//		stack.peek();
//		stack.pop();
//		stack.display();
//		stack.peek();
		StackUsingLinkedList list=new StackUsingLinkedList();
		list.push(10);
		list.push(20);
		list.push(30);
		list.display();
		list.pop();
		list.display();
	}
}
