package HashMap;

public class Driver {
	public static void main(String[] args) {
		HashMapUsingArray hashmap=new HashMapUsingArray();
		hashmap.put(4, "Bhaskar");
		hashmap.put(2, "Somrik");
		hashmap.put(1, "Uday");
		hashmap.put(3, "Somrik");
		hashmap.display();
		System.out.println(hashmap.get(2));
	}
}
