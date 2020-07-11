package array;

public class Assignment18Count {

	public static void main(String[] args) {

		// Suppose there is an integer array holding following elements:
		// 1,3,4,5,6,3,2,4,6,7,9,4,12,3,4,6,8,9,7,6,43,2,4,7,7,5,2,1,3,4,6,311,1
		// Write a program which prints which each number from array and the times it
		// has been repeated in array

		int[] numbers = { 1, 3, 4, 5, 6, 3, 2, 4, 6, 7, 9, 4, 12, 3, 4, 6, 8, 9, 7, 6, 43, 2, 4, 7, 7, 5, 2, 1, 3, 4, 6,
				311, 1 };
		// System.out.println(numbers.length);
		int[][] calculated = new int[15][15];
		int calc_point = 0;

		for (int num = 0; num < numbers.length; num++) { 		// iterating main numbers array
			// temp = numbers[num];

			for (int i = 0; i < 15; i++) { 						// iterating count array for comparison
				// System.out.print(calculated[i][0]);
				if (calculated[i][0] == numbers[num]) { 		// increment count of number existing
					// System.out.println("match!");
					calculated[i][1]++;
					break;
				} else if (i == 14) { 							// adding new number to count array
					// System.out.println("unmatch!");
					calculated[calc_point][0] = numbers[num];
					calculated[calc_point][1]++;
					calc_point++;
				}
			}
		}

		// Printing the count array

		System.out.println();
		System.out.println("Number\tCount");

		for (int r = 0; r < 15; r++) {
			for (int c = 0; c <= 1; c++) {
				System.out.print(calculated[r][c] + "\t");
			}
			System.out.println();
		}
		// initialize count values of all to 0

	}

}
