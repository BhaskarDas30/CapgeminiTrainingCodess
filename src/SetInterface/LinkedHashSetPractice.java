package SetInterface;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetPractice {
	public static void main(String[] args) {
		Set<Integer> linkedhashset=new LinkedHashSet<>();
		linkedhashset.add(10);
		linkedhashset.add(20);
		linkedhashset.add(30);
		linkedhashset.add(40);
		System.out.println("LinkedHashSet : "+linkedhashset);
	}
}
