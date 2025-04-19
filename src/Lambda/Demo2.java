package Lambda;

import java.util.*;

public class Demo2 {
	public static void main(String[] args) {
//		List<String> list=Arrays.asList("java","c","python","html");
//		Collections.sort(list, (s1, s2) -> s2.compareTo(s1));
//		Collections.sort(list, (s1, s2) -> s1.length()-s2.length());
//		list.forEach(s -> System.out.println(s));
		
		List<Double> list=Arrays.asList(15.5,2.5,7.5,19.5,10.5);
		Collections.sort(list, (d1,d2) -> Double.compare(d2, d1));
		list.forEach(d -> System.out.println(d));
	}
}
