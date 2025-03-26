package Inheritance;

public class VehicleDriver {
	public static void main(String[] args) {
		Bike bike=new Bike("1234","Bajaj","Pulsar", 5000, true, true);
		Car car=new Car("1122","Hyundai","i10",10000,true,4);
		bike.diplayDetails();
		car.displayDetails();
	}
}
