package FileHandling;

import java.io.File;
import java.io.IOException;

public class Demo {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\User\\Desktop\\New folder\\File Handling\\Demo\\file.txt");
//		boolean b=f.mkdir();
		boolean b=f.createNewFile();		
		System.out.println(b);
	}
}
