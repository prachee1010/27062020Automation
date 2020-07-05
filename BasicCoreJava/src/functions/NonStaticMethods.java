package functions;

public class NonStaticMethods {

	public String name = "Prachee";

	public static void main(String[] args) {

		// reference //object
		NonStaticMethods obj = new NonStaticMethods(); // object creation
		System.out.println(obj.name);
	}

}
