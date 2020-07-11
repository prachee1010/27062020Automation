package functions;

public class Car {

	String color;
	int capacity;
	
	public void features() {
		System.out.println("Car features are, Color="+color+" and capacity="+capacity);
	}
	
	public Car(String color, int capacity) {		//our global and local variable name are same
		this.color = color;		//this refers to global variable
		this.capacity = capacity;	//only variable name will refer to instance variable
	}
	
	public Car() {		//Constructor overloading
		
	}
}
