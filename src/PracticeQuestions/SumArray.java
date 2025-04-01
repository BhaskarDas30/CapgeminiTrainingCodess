package PracticeQuestions;
import java.util.Arrays;
public class SumArray {
	public static int[] Calculate(int arr[]) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
			arr[i]=sum;
		}
		return arr; 
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3,4};
		Calculate(arr);
		System.out.println(Arrays.toString(arr));
	}
}
