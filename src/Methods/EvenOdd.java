package Methods;

import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the Number : ");
		n=sc.nextInt();
		if(n%2==0)
			System.out.println(n+" is even");
		else
			System.out.println(n+" is odd");
		sc.close();
	}
}
