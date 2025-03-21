package Arrays;

import java.util.Scanner;

public class Task1 {
	public static int Calculate(int arr[], int target) {
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]==target)
//				return i;
//			else {
//				if(target<arr[i])
//					return (i);
//			}
//		}
		int start=0, end=arr.length-1;
		while(start<=end) {
			int mid=start+((end-start)/2);
			if(target<arr[mid]) {
				end=mid-1;
			} 
			else if(target>arr[mid]) {
				start=mid+1;
			}
			else 
				return mid;
		}
		return end;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {2,5,7,9,12,23,42};
		int target=sc.nextInt();
		System.out.println(Calculate(arr,target));
		sc.close();
	}
}
