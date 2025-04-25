package FileHandling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SaveImage {
	public static void main(String[] args) throws IOException {
		String image = "C:\\Users\\User\\Downloads\\image.jpg";
		
		Path p=Paths.get(image);
		byte b[]=Files.readAllBytes(p);
		FileOutputStream f=new FileOutputStream("C:\\Users\\User\\Desktop\\New folder\\File Handling\\Demo\\NewImage.jpg");
		f.write(b);
		System.out.println("Image Saved");
	}

}
