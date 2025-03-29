package CaseStudy;

public class Bike extends AbstractVehicle {
	Bike(String name, int speed) {
		super(name, speed);
	}
	@Override
	public void start() {
		System.out.println("Bike is Starting");
	}
	@Override
	public void stop() {
		System.out.println("Bike is Stoping");
	}
}
