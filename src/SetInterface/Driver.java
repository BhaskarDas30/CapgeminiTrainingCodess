package SetInterface;

import java.util.*;

public class Driver {
	public static void main(String[] args) {		
		Set<Student> set = new HashSet<>();
		set.add(new Student(1, "Bhaskar", 90));
		set.add(new Student(1, "Bhaskar", 90));
		set.add(new Student(2, "Somrik", 85));
		System.out.println(set);
	}
}
