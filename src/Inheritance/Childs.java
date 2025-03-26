package Inheritance;

public class Childs extends Parents {
	String name="Ronaldo";
	void dislay() {
		String name="Local";
		System.out.println(name);
		System.out.println(this.name);
		System.out.println(super.name);
	}
}
