package Methods;

import java.util.Scanner;

public class Palindrome {
	public static boolean Calculate(int n) {
		int rem=0,rw=0;
		int temp=n;
		while(n>0) {
			rem=n%10;
			rw=rw*10+rem;
			n/=10;
		}
		if(rw==temp)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		boolean result=Calculate(num);
		System.out.println(result);
	}
}
