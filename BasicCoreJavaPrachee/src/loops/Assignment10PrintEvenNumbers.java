package loops;

public class Assignment10PrintEvenNumbers {

	public static void main(String[] args) {

		//Write a for loop to print even numbers between 1 to 100
		
		for (int i = 0; i <= 100; i+=2) {
			System.out.print(i+" ");
			if (i==50) {
				System.out.println();
			}
		}
	}

}
