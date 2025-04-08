package Stack;
import java.util.Arrays;
import java.util.EmptyStackException;
public class StackUsingArray {
	private int data[];
	private int pointer = -1;
	final private int initial_capacity = 10;
	StackUsingArray() {
		data = new int[initial_capacity];
	}
	public boolean isFull() {
		return pointer==data.length-1;
	}
	public boolean isEmpty() {
		return pointer==-1;
	}
	public boolean push(int value) {
		if(isFull()) {
			data = Arrays.copyOf(data, data.length*2);
		}
		pointer++;
		data[pointer]=value;
		return true;
	}
	public int pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		int temp=data[pointer];
		pointer--;
		return temp;
	}
	public void peek() {
		System.out.println(data[pointer]);
	}
	public void display() {
		for(int i=0;i<=pointer;i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println("<- top");
	}
}
