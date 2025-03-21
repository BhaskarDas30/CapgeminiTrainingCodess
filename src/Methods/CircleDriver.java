package Methods;

import java.util.Scanner;
public class CircleDriver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r;
		r=sc.nextInt();
		Circle c=new Circle();
		System.out.println(c.findArea(r));
		sc.close();
	}
}