package Reflection;

import java.lang.reflect.Field;

public class Driver4 {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		Class<Person> c=Person.class;
		// get all variables
		Field all_var[]=c.getDeclaredFields();
		for(Field field : all_var) {
			System.out.println(field);
		}
		System.out.println("-------------------------");
		Field var=c.getDeclaredField("age");
		System.out.println(var);
	}
}
