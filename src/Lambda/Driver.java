package Lambda;

public class Driver {
	public static void main(String[] args) {
		//		MyOperation m = new MyOperation() {
		//			@Override
		//			public void operate() {
		//				System.out.println("Method is overriden");
		//			}
		//		};
		
//		no argument abstract method
		
//		MyOperation m = () -> {  
//			System.out.println("Method is overriden");
//		};
//		abstract method with parameters
		
//		MyOperation m = (int a) -> System.out.println(a);
//		MyOperation m = (a) -> System.out.println(a);
//		MyOperation m = (a, b) -> {
//			System.out.println(a);
//			System.out.println(b);
//		};
		
//		using return keyword
//		MyOperation m = (a,b) -> {
//			return a+b;
//		};
		// if there is only one return statement no need to write the return keyword
		MyOperation m = (a,b) -> a+b; 
		
		System.out.println(m.operate(10, 20));
	}
}
