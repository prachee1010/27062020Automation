package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<>();
		
		set.add("Prachee");
		set.add("Anand");
		set.add("Ajink");
		
/*		for(String name: set) {
			System.out.println(name);
		}*/
		
		Iterator<String> it = set.iterator();	
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
