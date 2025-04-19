package Lambda;

import java.util.*;

public class Demo {
	public static void main(String[] args) {
//		List<Integer> list = List.of(1,2,3,4,5); we can't update the data in the list
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Collections.sort(list, (n1,n2) -> n2-n1); // overriding compare method
		list.forEach(t -> System.out.println(t));
		
	}

}
