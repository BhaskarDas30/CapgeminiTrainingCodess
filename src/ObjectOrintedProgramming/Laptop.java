package ObjectOrintedProgramming;

public class Laptop {
	String model;
	int price;
	int ram;
	Laptop(String model, int price, int ram) {
		System.out.println("Constructor is created");
		this.model=model;
		this.price=price;
		this.ram=ram;
	}
}
