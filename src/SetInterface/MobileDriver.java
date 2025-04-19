package SetInterface;

import java.util.PriorityQueue;

public class MobileDriver {
	public static void main(String[] args) {
		PriorityQueue<Mobile> p = new PriorityQueue<>(new PriceComparator());
		p.add(new Mobile("Apple",60000));
		p.add(new Mobile("Oppo",20000));
		p.add(new Mobile("Motorola",40000));
		System.out.println(p);
		while(!p.isEmpty()) {
			System.out.println(p.poll()+" ");
		}
	}
}
