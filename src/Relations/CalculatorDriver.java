package Relations;

public class CalculatorDriver {
	public static void main(String[] args) {
		Calculator c=new Calculator(10,20);
		Calculator.add(c).mul(c);
		System.out.println(c.getResult());
	}
}
