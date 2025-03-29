package Abstraction;

public class ChildCalci2 extends Calci2 {
	@Override
	double square(double a) {
		return a*a;
	}
	@Override
	double cube(double a) {
		return a*a*a;
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
