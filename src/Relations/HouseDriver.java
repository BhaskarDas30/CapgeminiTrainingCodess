package Relations;

public class HouseDriver {
	public static void main(String[] args) {
		House house=new House("Blue", 600);
		System.out.println(house.getColor());
		System.out.println(house.getRoom().getArea());
		house = null;
		System.out.println(house.getRoom().getArea());
	}
}
