package WrapperClass;

public class Convert {
	public static void main(String[] args) {
//		boxing
		int a = 10;
		Integer a2 = new Integer(a);
		Integer a3 = Integer.valueOf(a);
//		auto boxing
		Integer a4 = a;
		System.out.println(a+"\t"+a2+"\t"+a3+"\t"+a4);
		System.out.println(a+"\t"+a2+"\t"+a3+"\t"+a4);
		byte b=5;
		Byte b2=b;
		System.out.println(b+"\t"+b2);
		short s=50;
		Short s2=s;
		System.out.println(s+"\t"+s2);
		long l=500;
		Long l2=l;
		System.out.println(l+"\t"+l2);
//		unboxing
		Integer i = new Integer(25);
		int i2=i.intValue();
		int i3=i;
		System.out.println(i+"\t"+i2+"\t"+i3);		
	}
}
