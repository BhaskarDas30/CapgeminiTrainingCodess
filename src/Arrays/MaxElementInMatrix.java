package Arrays;

import java.util.Arrays;

public class MaxElementInMatrix {
	public static int[] Calculate(int arr[][]) {
		int max=0;
		int i=0,j = 0;
		for( i=0;i<arr.length;i++) {
			for( j=0;j<arr[i].length;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];		
				}
			}
		}
		return new int[] {i-1,j-1};
	}
	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(Arrays.toString(Calculate(arr)));
	}
}
