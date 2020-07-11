package array;

public class Assignment16GreatestNumber {

	public static void main(String[] args) {

		// Find the greatest number in a array

		int[] numbers = { 23, 43, 57, 324, 56, 78, 23, 65, 77, 2 };

		int max = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		System.out.println("Greatest number in array is : " + max);
	}

}
