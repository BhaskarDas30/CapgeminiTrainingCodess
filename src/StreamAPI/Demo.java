package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;	

public class Demo {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(1,3,5,6,2,4,3,5);
		List<Integer> res1=list.stream().filter(i -> i%2==0).toList();
		System.out.println(res1);
		List<Integer> res2=list.stream().map(i -> i+1 ).toList();
		System.out.println(res2);
		List<Integer> res3=list.stream().skip(2).toList();
		System.out.println(res3);
		List<Integer> res4=list.stream().limit(3).toList();
		System.out.println(res4);		
		List<Integer> res5=list.stream().sorted().toList();
		System.out.println(res5);
		List<Integer> res6=list.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(res6);
		List<Integer> res7=list.stream().distinct().toList();
		System.out.println(res7);
		List<Integer> res8=list.stream().filter(n -> n%2!=0).toList();
		System.out.println(res8);
		int res=list.stream().max(Integer :: compare).get();
		System.out.println(res);
		
		List<String> l=Arrays.asList("apple","banana","arm","city","city","kiwi","gauava","dog","to");
		Map<Integer, List<String>> map=l.stream().collect(Collectors.groupingBy(String::length));
		System.out.println(map);
	}
}
