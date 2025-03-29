package CaseStudy;

public class Truck extends AbstractVehicle {
	Truck(String name, int speed) {
		super(name, speed);
	}
	@Override
	public void start() {
		System.out.println("Truck is Starting");
	}
	@Override
	public void stop() {
		System.out.println("Truck is Stoping");
	}
}
