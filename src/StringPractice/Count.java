package StringPractice;

public class Count {
	public static void main(String[] args) {
		String s="hello";
		char ch='l';
		int c=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==ch)
				c++;
		}
		System.out.println(c);
	}
}
