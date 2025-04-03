package PracticeQuestions;

public class MissingElement {
	public static void main(String[] args) {
		int arr[]= {3,0,1};
		int l=arr.length;
		int sum=0,maxsum=0;
		for(int i : arr) {
			sum+=i;
		}
		maxsum=(l*(l+1))/2;
		int missing = maxsum-sum;
		System.out.println(missing);
	}
}
