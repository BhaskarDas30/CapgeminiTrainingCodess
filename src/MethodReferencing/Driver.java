package MethodReferencing;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Driver {
	public static void main(String[] args) {
//		Operation o = new Calci()::add;
//		int r=o.operate(10, 20);
//		System.out.println(r);
		List<Integer> list=Arrays.asList(1,6,3,5,4,2);
		list.forEach(System.out :: println);
		Collections.sort(list, Integer::compareTo);
		list.forEach(System.out :: println);
		
		Integer[] arr=list.toArray(Integer[] :: new);
	}
}
