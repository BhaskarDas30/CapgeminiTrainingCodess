package Methods;

import java.util.Scanner;

public class Condition {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the Number : ");
		n=sc.nextInt();
		if(n>=0)
			System.out.println(n+" is positive");
		else
			System.out.println(n+" is negative");
	}
}
