package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class Demo2 {
	public static void main(String[] args) {
		List<String> list=Arrays.asList("apple","banana","grape","guava");
//		List<String> res=list.stream().map(s -> s.toUpperCase()).toList();
		String res=list.stream().filter(s -> s.charAt(0) == 'g').findFirst().get();
		System.out.println(res);
	}
}
