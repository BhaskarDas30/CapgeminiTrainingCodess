package Relations;

public class ATM {
	public static void main(String[] args) {
		
		BankAccount user=new BankAccount();
		System.out.println(user.Deposit(10000).Deposit(10000).Withdraw(21000).getBalance());;
	}
}
