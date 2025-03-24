package Relations;

public class Circle {
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Circle getDiameter() {
		System.out.println("Diameter : "+getRadius()*2);
		return this;
	}
	public Circle getPerimeter() {
		System.out.println("Perimeter : "+(Math.PI*getRadius()*2));
		return this;
	}
	public Circle getArea() { 
		System.out.println("Area : "+(Math.PI*Math.pow(getRadius(), 2)));
		return this;
	}
}
