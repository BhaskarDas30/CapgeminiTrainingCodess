package Methods;
import java.util.Arrays;
public class LinearSearch {
	public static int[] LinearSearch(int arr[][], int target) {
		int a[]= {-1,-1};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==target) {
					a[0]=i;
					a[1]=j;
					return a;
				}
			}
		}
		return a;
	}
	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int target=5;
		int result[]=LinearSearch(arr, target);
		System.out.println(Arrays.toString(result));
	}
}
