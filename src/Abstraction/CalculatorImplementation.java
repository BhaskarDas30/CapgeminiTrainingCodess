package Abstraction;

public class CalculatorImplementation extends Calculator {
	@Override
	public int add(int a,int b) {
		return a+b;
	}

	@Override
	public int sub(int num1, int num2) {
		return num1-num2;
	}

	@Override
	public int mul(int num1, int num2) {
		return num1*num2;
	}
}
