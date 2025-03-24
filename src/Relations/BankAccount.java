package Relations;

public class BankAccount {
	private double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	public BankAccount Deposit(double amount) {
		if(amount>0) {
			setBalance(getBalance()+amount);
		}
		else
			System.out.println("Invalid");
		return this;
	}
	public BankAccount Withdraw(double amount) {
		if(amount>0 && getBalance()>=amount) {
			setBalance(getBalance()-amount);
		}
		else
			System.out.println("Invalid");
		return this;
	}
}
