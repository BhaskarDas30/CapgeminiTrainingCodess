package Generics;

import java.util.LinkedList;

public class wc2 {
//	public static void printLinkedList(LinkedList<?> list) {
//      list.add(10);
//		for(Object i : list) {
//			System.out.print(i+" ");
//		}
//		Object i = list.get(0); // data returned as object type
//	}
//	public static void printLinkedList(LinkedList<? extends Number> list) {
//      list.add(10);
//		for(Number i : list) {
//			System.out.print(i+" ");
//		}
//		Number i = list.get(0); // data returned as Number type
//	}
	public static void printLinkedList(LinkedList<? super Integer> list) {
        list.add(10);
		for(Object i : list) {
			System.out.print(i+" ");
		}
		System.out.println();
		Object i = list.get(0); // data returned as Number type
	}
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<>();
		printLinkedList(list);
		list.add(10);
		list.add(20);
		list.add(30);
		printLinkedList(list);
	}
}
