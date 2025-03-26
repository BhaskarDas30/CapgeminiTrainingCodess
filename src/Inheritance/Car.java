package Inheritance;

public class Car extends Vehicle{
	private int numberOfDoors;
	Car() {}
	Car(String vehicleNumber, String brand, String model, double rentalPricePerDay, boolean isAvailable, int numberOfDoors) {
		super(vehicleNumber, brand, model, rentalPricePerDay, isAvailable);
		this.numberOfDoors=numberOfDoors;
	}
	public int isNumberOfDoors() {
		return numberOfDoors;
	}
	public void setNumberOfDoors(boolean numberOfDoors) {
//		this.numberOfDoors = numberOfDoors;
	}
	public void displayDetails() {
		super.displayDetails();
		super.rentVehicle();
		System.out.println("Number of Doors : "+numberOfDoors);
	}
}
