package Encapsulation;

public class Account {
	private String AccountHolderName;
	private double AccountBalance;
	private int AccountNumber;
	public String getAccountHolderName() {
		return AccountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.AccountHolderName = accountHolderName;
	}
	public double getAccountBalance() {
		return AccountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.AccountBalance = accountBalance;
	}
	public int getAccountNumber() {
		return AccountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.AccountNumber = accountNumber;
	}
	public void Withdraw(int amount) {
		System.out.println("Current Balance : "+AccountBalance);
//		if(amount<0) 
//			System.out.println("Enter a Valid Amount");
		if(amount>0 && amount<=AccountBalance) {
			System.out.println("Not Sufficient Balance");
		}
		AccountBalance-=amount;
		System.out.println("Balance After Withdrawal : "+AccountBalance);
	}
	public void Deposit(int amount) {
		if(amount>0) {
			System.out.println("Current Balance : "+AccountBalance);			
			AccountBalance+=amount;
			System.out.println("Balance After Deposit : "+AccountBalance);
		}
		else
			System.out.println("Invalid Money");
	}
	public void Check() {
		System.out.println("Current Balance : "+AccountBalance);
	}
	Account(String name, int number, double balance) {
		this.AccountHolderName=name;
		this.AccountBalance=balance;
		this.AccountNumber=number;
	}
}
