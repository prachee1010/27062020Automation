package exceptionHandling;

public class TryCatchBlock2 {

	public static Functions fun; // it is reference, default value null

	public static void main(String[] args) {

		// When Steps 1,2,3 are dependant so don't continue execution

		// Code from ExceptionClass1
		// Step 1 : Verify about link is present
		try {

			int a = 10, b = 0;
			System.out.println(a / b);

			// Step 2 : Verify downloads link is present

			String[] str = new String[2];
			str[1] = "Prachee";

			// Step 3 : Verify projects link is present
			fun.fun1();

		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException Occurred : " + e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException Occurred : " + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException Occurred : " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception Occurred : " + e.getMessage());
		}

	}

}
