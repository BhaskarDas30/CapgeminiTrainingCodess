package ExceptionHandling;

public class IncorrectPin extends RuntimeException {
	private static String message = "Incorrect PIN";
	public IncorrectPin() {
		// TODO Auto-generated constructor stub
		super(message);
	}
}
