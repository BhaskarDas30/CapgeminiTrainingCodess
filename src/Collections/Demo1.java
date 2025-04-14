package Collections;

import java.util.ArrayList;

public class Demo1 {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		System.out.println(a);
		a.add(1, 15);
		System.out.println(a);
		a.set(3, 25);
		System.out.println(a);
	}
}