package Reflection;

import java.lang.reflect.Method;

public class Driver3 {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Class<Person> c=Person.class;
		// no arg method
		Method m1=c.getMethod("getDetails");
		System.out.println(m1);
		System.out.println("-------------------------");
		Method m2=c.getDeclaredMethod("task", String.class);
		System.out.println(m2);
		
	}
}
