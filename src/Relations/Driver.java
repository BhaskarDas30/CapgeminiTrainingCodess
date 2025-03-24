package Relations;

public class Driver {
	public static void main(String[] args) {
		Passport passport =new Passport("123456");
		Person person=new Person("Bhaskar", passport);
		System.out.println(person.getName());
		System.out.println(person.getPassport().getPassport_number());
	}
}
