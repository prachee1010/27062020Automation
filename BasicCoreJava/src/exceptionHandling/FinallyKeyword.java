package exceptionHandling;

public class FinallyKeyword {

	public static void main(String[] args) {

		try {
			System.out.println("Connect to Database");
			System.out.println(10 / 2);

		} catch (Exception e) {
			System.out.println("Exception"+e.getMessage());
		} finally {
			System.out.println("Close DB Connection");	//will be executed in both try&catch block
		}

	}

}
