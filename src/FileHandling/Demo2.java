package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Demo2 {
	public static void main(String[] args) throws IOException {
		FileWriter f=new FileWriter("C:\\Users\\User\\Desktop\\New folder\\File Handling\\Demo\\file.txt");
		f.write("hi");
		f.write("\n");
		f.write('a');
		f.write("\n");
		f.write(99);
		f.flush();
		System.out.println("Data Written");
	}
}
