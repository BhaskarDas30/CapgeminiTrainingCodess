package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream f=new FileInputStream("C:\\Users\\User\\Desktop\\New folder\\File Handling\\Demo\\Employee.txt");
		ObjectInputStream o=new ObjectInputStream(f);
		
		Employee e=(Employee) o.readObject();
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSalary());
		
	}
}