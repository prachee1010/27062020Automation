package array;

public class Assignment14ReverseArray {

	public static void main(String[] args) {

		// Make an integer array. Write a for loop to print the integer array in
		// reverse.

		int[] int_array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = int_array.length - 1; i >= 0; i--) {
			System.out.print(int_array[i] + " ");
		}
	}

}
