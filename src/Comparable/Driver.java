package Comparable;
import java.util.Arrays;

public class Driver {
	public static void main(String[] args) {
		Student student[] = {
				new Student("Deep", 3, 95),
				new Student("Bhaskar", 1, 90),
				new Student("Aniket", 4, 96),
				new Student("Somrik", 2, 92)
		};
		Arrays.sort(student);
		for(Student s : student) {
			System.out.println(s);
		}
	}
}
