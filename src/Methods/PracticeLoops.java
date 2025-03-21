package Methods;

import java.util.Scanner;

public class PracticeLoops {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int size=0;
		int n1=n;
		int n2=n;
		while(n>0) {
			n/=10;
			size++;
		}
		int rem=0,sum=0;
		while(n1>0) {
			rem=n1%10;
			sum+=Math.pow(rem,size);
			n1/=10;
		}
		if(sum==n2)
			System.out.println(n2+" is a Armstrong Number");
		else
			System.out.println(n2+" is not a Armstrong Number");
		
	}
}
