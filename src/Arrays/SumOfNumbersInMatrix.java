package Arrays;

public class SumOfNumbersInMatrix {
	public static void main(String[] args) {
		int arr[][]=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr[i].length;j++) {
				sum+=arr[i][j];
			}
		System.out.println("RowSum = "+sum);
		}
		for(int j=0;j<arr.length;j++) {
			int sum=0;
			for(int i=0;i<arr[j].length;i++) {
				sum+=arr[i][j];
			}
		System.out.println("ColumnSum = "+sum);
		}
	}
}
