package Methods;

import java.util.Scanner;

public class LargestOfThree {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2,num3;
		num1=sc.nextInt();
		num2=sc.nextInt();
		num3=sc.nextInt();
		if((num1>num2)&&(num1)>num3)
			System.out.println(num1+" is greatest number");
		else if((num2>num1)&&(num2>num3))
			System.out.println(num2+" is greatest number");
		else
			System.out.println(num3+" is greatest number");
	}
}