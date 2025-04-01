package CaseStudy;

abstract public class AbstractVehicle implements Vehicle {
	protected String name;
	protected int speed;
	public AbstractVehicle(String name, int speed) {
		this.name=name;
		this.speed=speed;
	}
	@Override 
	public void accelerate(int increment) {
		this.speed+=increment;
	}
	@Override
	public void brake(int decrement) {
		this.speed-=decrement;
	}
	@Override
	public int getCurrentSpeed() {
		return speed;
	}
	public void displaydetails() {
		System.out.println("Name : "+name);
		System.out.println("Speed : "+speed);
	}	
}
