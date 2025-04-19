package SetInterface;

public class Mobile {
	String brand;
	double price;
	public Mobile(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}
	public String toString() {
		return this.brand+" "+this.price;
	}
}
