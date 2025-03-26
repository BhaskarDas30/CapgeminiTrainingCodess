package Inheritance;

public class Bike extends Vehicle{
	private boolean hasGear;
	public Bike() {}
	public Bike(String vehicleNumber, String brand, String model, double rentalPricePerDay, boolean isAvailable, boolean hasGear) {
		super(vehicleNumber, brand, model, rentalPricePerDay, isAvailable);
		this.hasGear=hasGear;
	}
	public boolean isHasGear() {
		return hasGear;
	}
	public void setHasGear(boolean hasGear) {
		this.hasGear = hasGear;
	}
	public void diplayDetails() {
		super.displayDetails();
		super.rentVehicle();
		System.out.println("Hasgear : "+this.hasGear);
	}
}
