package array;

public class Assignment17LeastNumber {

	public static void main(String[] args) {

		// Find the least number in a array

		int[] numbers = { 23, 43, 57, 324, 56, 78, 23, 65, 77, 2 };

		int min = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		System.out.println("Minimum number in array is : " + min);
	}

}
