package Generics;

public class Driver {
	public static void main(String[] args) {
//		Box<Integer> b1=new Box<>(10);
//		System.out.println(b1.getValue());
//		Box<String> b2=new Box<>("Java");
//		System.out.println(b2.getValue());
		
		Shape<Integer, String> s1=new Shape<>(1, "Circle");
		Shape<Integer, String> s2=new Shape<>(2, "Square");
		Shape<Integer, String> s3=new Shape<>(3, "Triangle");
		System.out.println(s1.getKey()+" -> "+s1.getValue());
		System.out.println(s2.getKey()+" -> "+s2.getValue());
		System.out.println(s3.getKey()+" -> "+s3.getValue());
	}
}
