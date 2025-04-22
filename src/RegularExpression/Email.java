package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {
	public static void main(String[] args) {
		String email="dassbhaskar2002@gmail.com";
		String regex="^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(email);
		boolean res=matcher.matches();
		
		if(res) {
			System.out.println("Email Valid");
		} else {
			System.out.println("Email is not Valid");			
		}
		
	}

}
