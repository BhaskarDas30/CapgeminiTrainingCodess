package ExceptionHandling;

import java.util.Scanner;

public class EligibiltyCriteria {
	public static void ageChecker(int age) {
		if(age>=21) {
			System.out.println("Go get married");
		} else {
			throw new InvalidAge("Biye Hobena");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age : ");
		int age=sc.nextInt();
		ageChecker(age);
	}
}
