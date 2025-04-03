package ExceptionHandling;

public class InvalidMoney extends RuntimeException {
	private static String message = "Invalid Money";
	public InvalidMoney() {
		// TODO Auto-generated constructor stub
		super(message);
	}
}
