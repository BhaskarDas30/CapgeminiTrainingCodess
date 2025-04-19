package Map;

import java.util.*;

public class linkedhashmapPractice {
	public static void main(String[] args) {
//		Map<Integer, String> map=new LinkedHashMap<>();
		Map<String, Integer> map=new TreeMap<>();
		map.put("Bhaskar",1);
		map.put("Deeptanghsu",2);
		map.put("Somrik",3);
		map.put("Aniket",4);
//		map.put(null, null);
		System.out.println(map);
		
	}
}
