package Reflection;

import java.lang.reflect.Method;

public class Driver2 {
	public static void main(String[] args) {
		Class<Person> c=Person.class;
		// returns all public methods of same and super class as array
		Method all_methods[]=c.getMethods();
		for(Method method : all_methods) {
			System.out.println(method);
		}
		System.out.println("-------------------------");
		// returns all level methods of same class as array
		Method allmethods[]=c.getDeclaredMethods();
		for(Method method : allmethods) {
			System.out.println(method);
		}
		System.out.println("-------------------------");
		
		Class<Object> c2=(Class<Object>) c.getSuperclass();
		Method object_all_methods[]=c2.getDeclaredMethods();
		for(Method method : object_all_methods) {
			System.out.println(method);
		}
	}
}
