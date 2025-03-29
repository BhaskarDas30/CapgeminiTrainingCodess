package Abstraction;

public class Driver {
	public static void main(String[] args) {
		Calculator c=new CalculatorImplementation();
		System.out.println(c.add(10,20));
		System.out.println(c.sub(20, 10));
		System.out.println(c.mul(10, 20));
	}
}
