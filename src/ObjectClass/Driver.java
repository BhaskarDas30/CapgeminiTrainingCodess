package ObjectClass;

public class Driver {
	public static void main(String[] args) {
		Student s1=new Student("Bhaskar", 90, 1000);
		Student s2=new Student("Deeptanghu", 94, 1100);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.hashCode()==s2.hashCode());
	}
}
