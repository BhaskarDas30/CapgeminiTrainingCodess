package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Demo4 {
	public static void main(String[] args) throws IOException {
		FileWriter f=new FileWriter("C:\\Users\\User\\Desktop\\New folder\\File Handling\\Demo\\file.txt");
		BufferedWriter b=new BufferedWriter(f);
		b.write("hi");
		b.newLine();
		b.write(100);
		b.newLine();
		b.write('z');
		b.flush();
		System.out.println("Data Written");
	}
}
