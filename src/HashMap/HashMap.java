package HashMap;

import java.util.LinkedList;

public class HashMap {
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list);
		System.out.println(list.size());
		list.remove(2);
		System.out.println(list);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		for(int i : list) {
			System.out.println(i);
		}
	}
}
