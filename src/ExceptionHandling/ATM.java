package ExceptionHandling;

import java.util.Scanner;

public class ATM {
	public static void withdraw(double money, double pin) {
		if(pin<0) {
			throw new IncorrectPin();
		}			
		if(money<0) {
			throw new InvalidMoney();
		}		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the money : ");
		double money=sc.nextDouble();
		System.out.println("Enter PIN");
		int pin=sc.nextInt();
		withdraw(money, pin);
	}
}
