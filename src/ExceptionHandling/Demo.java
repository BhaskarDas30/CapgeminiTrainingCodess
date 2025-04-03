package ExceptionHandling;

public class Demo {
	public static void printNumber() throws InterruptedException {
		for(int i=1;i<=10;i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
	}
	public static void Demo2() throws InterruptedException{
		printNumber();
	}
	public static void main(String[] args) {
		try {
			Demo2();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
