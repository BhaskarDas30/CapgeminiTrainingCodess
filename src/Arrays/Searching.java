package Arrays;

import java.util.Scanner;
public class Searching {
	public static int Calculate(int arr[], int n) {
		int start=0;
		int end=arr.length-1;
		while(n>0) {
			int mid=(start+end)/2;
			if(n<arr[mid]) {
				end=mid-1;
			}
			else if(n>arr[mid]) {
				start=mid+1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4,5,6};
		int n=sc.nextInt();
		System.out.println(Calculate(arr,n));
		}
	}