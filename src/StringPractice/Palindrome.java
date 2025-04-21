package StringPractice;

public class Palindrome {
	public static void main(String[] args) {
		String s = "abba";
		String rw="";
		for(int i=0;i<s.length();i++) {
			rw=s.charAt(i)+rw;
		}
		if(s.equals(rw))
			System.out.println("String is Palindrome");
		else
			System.out.println("String is not Palindrome");			
	}
}
