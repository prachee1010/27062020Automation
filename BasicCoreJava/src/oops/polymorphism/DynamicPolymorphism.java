package oops.polymorphism;

import oops.inheritance.Mobile;
import oops.inheritance.Smartphone;
import oops.inheritance.Telephone;

public class DynamicPolymorphism {

	public static void main(String[] args) {

		/*
		 * Smartphone obj = new Smartphone();
		 * 
		 * // Ref of parent can be used to create obj of child class // Ref of child
		 * class cannot be used to create obj of parent Mobile obj2 = new Smartphone();
		 */

		Telephone obj3;			//WebDriver
		
		//only calling can be done becz obj3 has refer of parent (Telephone)
		obj3 = new Telephone();
		obj3.calling();
		
		obj3=new Mobile();		//ChromeDriver
		obj3.calling();			//function is overridden hence function from child is called
		
		obj3=new Smartphone();	//FirefoxDriver
		obj3.calling();
		
		/*
		 * new Mobile(); obj3.calling();
		 */

	}

}
