package functions;

public class Function2 {

	public static String name= "Prachee";
	public static void main(String[] args) {
//		int c = sum(10, 20);
//		
//		
//		sum(10, 20, 30);
//		
//		message("Prachee");
//		
		eligibility("Anand", 32);
		eligibility("Prachee", 15);
		
		System.out.println(name);

	}

	public static void sum(int a, int b, int c) {		//method overloading

		System.out.println(a + b + c);
	}

	public static void sum(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void message(String name) {
		System.out.println("Welcome "+name);
		
	}
	
	public static void eligibility(String name, int age) {
		// logic
		if (age >= 18) {
			System.out.println(name + " you are eligible!");
		} else {
			System.out.println(name + " you are not eligible!");
		}
		
	}
}
