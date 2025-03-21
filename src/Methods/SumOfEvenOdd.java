package Methods;

import java.util.Scanner;

public class SumOfEvenOdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int evencount=0, oddcount=0,rem;
		while(n>0) {
			rem=n%10;
			if(rem%2==0) 
				evencount++;
			else
				oddcount++;
			n=n/10;
		}
		System.out.println(evencount*oddcount);
		sc.close();
	}
}