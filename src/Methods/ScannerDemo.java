package Methods;

import java.util.Scanner;
public class ScannerDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		String word,sentence;
		ch=sc.next().charAt(0);
		word=sc.next();
		sentence=sc.nextLine();
		System.out.println(ch);
		System.out.println(word);
		System.out.println(sentence);
		sc.close();
	}
}
