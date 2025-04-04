package PracticeQuestions;
public class CountEvenDigits {
	public static int Count(int n) {
		int c=0;
		while(n>0) {
			n/=10;
			c++;
		}
		return c;
	}
	public static void main(String[] args) {
		int arr[]= {12,345,2,6,7896};
		int c=0;
		for(int i=0;i<arr.length;i++) {
			int result=Count(arr[i]);
			if(result%2==0)
				c++;
		}
		System.out.println(c);
	}
}
