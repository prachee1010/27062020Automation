package loops;

public class Assignment12SumOf100 {

	public static void main(String[] args) {

		// Write a for loop to find the sum of first 100 numbers(1 to 100)

		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum = sum + i;
		}
		System.out.println("Sum of first 100 numbers is = " + sum);
	}

}
