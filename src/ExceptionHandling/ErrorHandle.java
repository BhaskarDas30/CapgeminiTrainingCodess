package ExceptionHandling;
public class ErrorHandle {
	public static void main(String[] args) {
		int arr[][] = new int[3][];
		try {
//			System.out.println(arr[5][5]);
			System.out.println(arr[1][1]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
