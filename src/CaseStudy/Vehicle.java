package CaseStudy;

public interface Vehicle {
	abstract public void start();
	abstract public void stop();
	abstract public void accelerate(int increment);
	abstract public void brake(int decrement);
	abstract public int getCurrentSpeed();
	default void displayType() {
		System.out.println("Type : Vehicle");
	}
}
