package CaseStudy;

public class Car extends AbstractVehicle {
	Car(String name, int speed) {
		super(name, speed);
	}
	@Override
	public void start() {
		System.out.println("Car is Starting");
	}
	@Override
	public void stop() {
		System.out.println("Car is Stoping");
	}
	
}
