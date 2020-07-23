package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapInterface {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		
		map.put("name", "Prachee Ghumatkar");
		map.put("email", "pracheeghumatkar10@gmail.com");
		map.put(null, "nullkey");
		
		System.out.println(map.get("name"));
		System.out.println(map.get("email"));
		System.out.println(map.get(null));
	}

}
