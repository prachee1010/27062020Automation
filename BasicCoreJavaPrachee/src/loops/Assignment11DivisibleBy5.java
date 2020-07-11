package loops;

public class Assignment11DivisibleBy5 {

	public static void main(String[] args) {

		// Write a for loop which prints numbers from 1 to 100 but if the number is divisible by 5,
		// it prints 'divisble by 5 followd by that number'

		for (int i = 0; i <= 100; i++) {

			if (i % 5 == 0) {
				System.out.println("\n" + i + ": Divisible by 5");
			} else {
				System.out.print(i + " ");
			}
		}
	}

}
