package Methods;

public class Sample {
	public static void s1() {
		System.out.println("Static Method");
	}
	public void s2() {
		System.out.println("Non Static Method");
	}
	public static void main(String[] args) {
		s1();
		Sample s=new Sample();
		s.s2();
	}
}
