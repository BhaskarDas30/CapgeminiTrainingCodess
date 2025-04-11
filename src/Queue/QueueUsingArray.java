package Queue;

import java.util.Arrays;

public class QueueUsingArray {
	private int data[];
	private int pointer=-1;
	private int initial_capacity=10;
	QueueUsingArray() {
		data=new int[initial_capacity];
	}
	QueueUsingArray(int size) {
		data=new int[size];
	}
	public boolean isFull() {
		return pointer==data.length-1;
	}
	public boolean insert(int value) {
		if(isFull()) {
			data = Arrays.copyOf(data, data.length*2);
		} else {
			pointer++;
			data[pointer]=value;
		}
		return true;
	}
	public boolean delete() {
		if(pointer==-1) {
			return false;
		} else {
			for(int i=1;i<=pointer;i++) {
				data[i-1]=data[i];
			}
			pointer--;
		}
		return true;
	}
	public int getsize() {
		return pointer-1;
	}
	public void display() {
		for(int i=0;i<=pointer;i++) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
	}
}
