package NonPrimitveTypeCasting;

public class Driver {
	public static void main(String[] args) {
		B b=new B();
		System.out.println(b instanceof B);
		System.out.println(b instanceof A);
//		System.out.println(b instanceof C);
		A a=new C();
		System.out.println(a instanceof A);
		System.out.println(a instanceof B);
		System.out.println(a instanceof C);
		System.out.println(a instanceof D);
	}
}
