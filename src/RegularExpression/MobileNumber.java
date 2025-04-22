package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumber {
	public static void main(String[] args) {
		String regex="\\d{3}[-.\\s]?\\d{3}[-.\\s]?\\d(4)";
		String text="Call me at 111 222 333 or 333-444-555 or 999.999.999";
		
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(text);
		
		while(matcher.find()) {
			String s=matcher.group();
			System.out.println(s);
		}
		text=matcher.replaceAll("*");
		System.out.println(text);
	}

}
