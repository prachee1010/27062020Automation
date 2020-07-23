package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface2 {

	public static void main(String[] args) {
		
		//1 - Prachee
		//2 - Anand
		//3 - Ajinkya

		Map<Integer, String> std = new HashMap<>();
		
		std.put(1, "Prachee");
		std.put(2, "Anand");
		std.put(3, "Ajinkya");
		
//		System.out.println(std.get(2));
		
		Set<Integer> set = std.keySet();
		
		for (int key:set) {
			System.out.println(std.get(key));
		}
		
	}

}
