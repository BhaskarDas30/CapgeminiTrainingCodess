package CaseStudy;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name=sc.nextLine();
		System.out.println("Enter Speed : ");
		int speed=sc.nextInt();
		System.out.println("Enter 1 for Car 2 for Bike 3 for Truck");
		int ch=sc.nextInt();
		AbstractVehicle vehicle = null;
		switch(ch) {
		case 1 : {
			vehicle = new Car(name, speed);
			break;
		}
		case 2 : {
			vehicle = new Bike(name, speed);
			break;
		}
		case 3 : {
			vehicle = new Truck(name, speed);
			break;
		}
		default : {
			System.out.println("Wrong Choice");
		}
		}
		if(vehicle instanceof Car) {
			vehicle = (Car) vehicle;
		}
		if(vehicle instanceof Bike) {
			vehicle = (Bike) vehicle;
		}
		if(vehicle instanceof Truck) {
			vehicle = (Truck) vehicle;
		}
		vehicle.start();
		System.out.println("Current Speed : "+vehicle.getCurrentSpeed());
		vehicle.accelerate(20);
		System.out.println("Current Speed : "+vehicle.getCurrentSpeed());
		vehicle.brake(10);
		System.out.println("Current Speed : "+vehicle.getCurrentSpeed());
		vehicle.stop();
		vehicle.displaydetails();
		vehicle.displayType();
		sc.close();
	}
}
