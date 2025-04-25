package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Driver1 {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//		To get Class Object
//		Class<Person> c2=(Class<Person>) new Person("Bhaskar", 22).getClass();
//		Class<Person> c3=(Class<Person>) Class.forName("Reflection.Person");
		
		Class<Person> c=Person.class;
		
		System.out.println(c.getPackageName()); 
		
		//getting specified constructor
		Constructor<Person> cons1 = c.getDeclaredConstructor();
		System.out.println(cons1);
		Constructor<Person> cons2 = c.getDeclaredConstructor(String.class, int.class);
		System.out.println(cons2);
		
		System.out.println("-------------------------");
		
		//get all constructor
		Constructor<?> all[] = c.getDeclaredConstructors();
		for(Constructor<?> constructor : all) {
			System.out.println(constructor);
		}
		System.out.println("-------------------------");
		 
		//call constructor
		Class<Person> c3=Person.class;
		Constructor<Person> con=c3.getDeclaredConstructor();
		con.setAccessible(true);
		Person p=con.newInstance();
		System.err.println(p);
	}
}
