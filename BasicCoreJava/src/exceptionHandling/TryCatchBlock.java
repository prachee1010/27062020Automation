package exceptionHandling;

public class TryCatchBlock {

	public static Functions fun; // it is reference, default value null

	public static void main(String[] args) {
		
		//When Steps 1,2,3 are not dependant so continue execution

		// Code from ExceptionClass1
		// Step 1 : Verify about link is present
		try {

			int a = 10, b = 0;
			System.out.println(a / b);
		} catch (Exception e) {
			System.out.println("Exception Occurred : " + e.getMessage());
		}

		// Step 2 : Verify downloads link is present
		try {

			String[] str = new String[2];
			str[2] = "Prachee";
		} catch (Exception e) {
			System.out.println("Exception Occurred : " + e.getMessage());
		}

		// Step 3 : Verify projects link is present
		fun.fun1();

	}

}
