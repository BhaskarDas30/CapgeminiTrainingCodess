package Abstraction;

public class ChildCalci1 extends Calci1 {
	@Override
	double power(double a, double b) {
		return Math.pow(a, b);
	}
	@Override
	int add(int a,int b) {
		return a+b;
	}
	@Override
	int sub(int a,int b) {
		return a-b;
	}
}
