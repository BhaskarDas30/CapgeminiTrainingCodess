package Generics;

public class GenericMethod {
	
	public<T> void printArray(T arr[]) {
		for(T i : arr) {
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args) {
		Integer arr[] = {1,2,3,4};
		new GenericMethod().printArray(arr);
	}
}
