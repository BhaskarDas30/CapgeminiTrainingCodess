package Inheritance;

public class Child extends Parent{
	static {
		System.out.println("child is loaded");
	}
	static void child() {
		System.out.println("child method");
	}
}
