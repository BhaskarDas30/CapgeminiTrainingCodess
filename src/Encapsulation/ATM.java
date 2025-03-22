package Encapsulation;
import java.util.*;
public class ATM {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Name : ");
		String name=sc.next();
		System.out.println("Enter Your Account Balance : ");
		double balance=sc.nextDouble();
		System.out.println("Enter Your Account Number : ");
		int number=sc.nextInt();
		Account user=new Account(name, number, balance);
		System.out.println("Welcome User "+user.getAccountHolderName());
		
		while(true) {
		System.out.println("------------------------");
		System.out.println("Enter 1 for Deposit");
		System.out.println("Enter 2 for Withdraw");
		System.out.println("Enter 3 for Check Balance");
		System.out.println("Enter 4 for Exit");
		System.out.println("Enter Your Choice : ");
		int ch=sc.nextInt();
		switch(ch) {
		case 1 : {
			System.out.println("Enter the Amount : ");
			int amount=sc.nextInt();
			user.Deposit(amount);
			break;
		}
		case 2 : {
			System.out.println("Enter the Amount : ");
			int amount =sc.nextInt();
			user.Withdraw(amount);
			break;
		}
		case 3 : {
			user.Check();
			break;
		}
		case 4 : {
			System.exit(0);
		}
		}
	}
}
}