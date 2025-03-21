package Methods;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2;
		char ch;
		System.out.println("Enter the Number 1 : ");
		num1=sc.nextInt();
		System.out.println("Enter the Number 2 : ");
		num2=sc.nextInt();
		System.out.println("Enter the Character : ");
		ch=sc.next().charAt(0);
		if(ch=='+')
			System.out.println(num1+num2);
		else if(ch=='-')
				System.out.println(num1-num2);
		else if(ch=='*')
			System.out.println(num1*num2);
		else if(ch=='/')
				System.out.println(num1/num2);
		else 
			System.out.println("Invalid Character");
		sc.close();
	}
}
