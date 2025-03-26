package PracticeQuestions;

public class NegativeSubSumArray {
	public static void main(String[] args) {
		int arr[]={-1,2,-3,4,-5};
		int c=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0)
				c++;
			int sum=arr[i];
			for(int j=i+1;j<arr.length;j++) {
				sum+=arr[j];
				if(sum<0)
					c++;
			}
		}
		System.out.println(c);
	}
}
