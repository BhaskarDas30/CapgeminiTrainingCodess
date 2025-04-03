package ExceptionHandling;

public class InvalidAge extends RuntimeException{
	private static String message = "Porashuna korr";
	InvalidAge() {
		super(message);
	}
	InvalidAge(String message) {
		super(message);
	}
}
