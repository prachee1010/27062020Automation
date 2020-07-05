package functions;

public class CallVariables2 {

	public static void main(String[] args) {

		System.out.println("Before change:");
		System.out.println("obj.fruit_name: "+Variables2.fruit_name);
		Variables2 obj = new Variables2();
		System.out.println("obj.price: "+obj.price+"\n");
		
		obj.fruit_name = "Kiwi";
		obj.price = 100;
		
		Variables2 obj2 = new Variables2();
		System.out.println("static var after change in obj: ");
		System.out.println("obj.fruit_name: "+obj.fruit_name);
		System.out.println("obj2.fruit_name: "+obj2.fruit_name);
		System.out.println("obj.price: "+obj.price);
		System.out.println("obj2.price: "+obj2.price);
	}

}
