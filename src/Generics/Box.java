package Generics;

public class Box<T> {
	private T value;
	Box(T value) {
		this.value=value;
	}
	public T getValue() {
		return value;
	}
//	T num1;
//	T num2;
//	Box(T num1, T num2) {
//		this.num1=num1;
//		this.num2=num2;
//	}
//	public void add(T num1, T num2) {
////		System.out.println(num1+num2);
//	}
//	public static void main(String[] args) {
//		Box<Integer> b1=new Box<Integer>(10, 20);
//		System.out.println(b1.num1+b1.num2);
//	}
}
