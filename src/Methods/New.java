package Methods;

public class New {
	public static int Display(char ch) {
		return ch;
	}
	public static void Name(String firstname, String lastname) {
		System.out.println(firstname+" "+lastname);
	}
	public static void main(String[] args) {
		System.out.println(Display('A'));;
		Name("Bhaskar", "Das");
	}
}
