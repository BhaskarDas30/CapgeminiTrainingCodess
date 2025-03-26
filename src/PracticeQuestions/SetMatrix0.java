package PracticeQuestions;

public class SetMatrix0 {
	public static void editArray(int resultarr[][], int r, int c) {
		for (int i = 0; i < resultarr[0].length; i++) {
			resultarr[r][i] = 0;
		}
		for (int j = 0; j < resultarr.length; j++) {
			resultarr[j][c] = 0;
		}
	}
	public static void main(String[] args) {
		int arr[][] = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		int resultarr[][] = new int[arr.length][arr[0].length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				resultarr[i][j]=arr[i][j];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == 0) {
					editArray(resultarr, i, j);
				}
			}
		}
		for (int i = 0; i < resultarr.length; i++) {
			for (int j = 0; j < resultarr[0].length; j++) {
				System.out.print(resultarr[i][j]);
			}
			System.out.println();
		}
	}
}
