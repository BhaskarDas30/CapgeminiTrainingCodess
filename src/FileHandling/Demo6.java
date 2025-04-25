package FileHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Demo6 {
	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter p=new PrintWriter("C:\\Users\\User\\Desktop\\New folder\\File Handling\\Demo\\file.txt");
		p.println(true);
		p.println(10.8);
		p.println("hi");
		p.println('a');
		p.println(1000);
		p.flush();
		System.out.println("Data Written");
		
	}
}
