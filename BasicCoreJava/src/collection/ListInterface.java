package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListInterface {

	public static void main(String[] args) {

		//Arraylist class implements List interface
		//<String>: String is generics Ex: <Integer>
		List<String> list= new Vector<>();
		
		list.add("Prachee");
		list.add("Anand");
		list.add("Ajinkya");
		list.add("Prachee");
		
		for(String name: list) {
			System.out.println(name);
		}
	}

}
