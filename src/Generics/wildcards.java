package Generics;

public class wildcards {
	public static void printBox(Box<? extends Number> box) {
		int value=(int) box.getValue();
		System.out.println(value);
	}
	public static void main(String[] args) {
		Box<Integer> b1=new Box<>(10);
		printBox(b1); 
		Box<Object> b2=new Box<>("Box");
//		printBox(b2);
	}
}
