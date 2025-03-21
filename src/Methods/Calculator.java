package Methods;

public class Calculator {
	public static void sub(int num1, int num2) {
		System.out.println(num1-num2);
	}
	public static void sub(int num1,int num2,int num3) {
		System.out.println(num1-num2-num3);
	}
	public static void mul(int num1, int num2) {
		System.out.println(num1*num2);
	}
	public static void mul(int num1, int num2, int num3) {
		System.out.println(num1*num2*num3);
	}
	public static void main(String[] args) {
		sub(20,10);
		sub(60,40,10);
		mul(2,3);
		mul(2,3,4);
	}
}
