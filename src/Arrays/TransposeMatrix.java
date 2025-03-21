package Arrays;
import java.util.*;
public class TransposeMatrix {
	public static void main(String[] args) {
		int arr[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		int transpose[][]=new int[arr[0].length][arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				transpose[i][j]=arr[j][i];
			}
		}
		for(int ele[]:transpose) {
			System.out.println(Arrays.toString(ele));
		}
	}
}
