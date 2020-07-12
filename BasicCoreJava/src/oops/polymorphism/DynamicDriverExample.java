package oops.polymorphism;

import oops.inheritance.Mobile;
import oops.inheritance.Smartphone;
import oops.inheritance.Telephone;

public class DynamicDriverExample {

	public static void main(String[] args) {
		
		//DynamicPolymorphism can be used to execute same script on different drivers 

		Telephone obj = null;			//ref of WebDriver is made (parent)

		String browserName = "Firefox";

		if (browserName.equals("Chrome")) 
		{
			obj = new Mobile();			//ChromeDriver
		} else if (browserName.equals("Firefox")) 
		{
			obj = new Smartphone();		//FirefoxDriver
		}

		// Script start
		obj.calling();
	}

}
