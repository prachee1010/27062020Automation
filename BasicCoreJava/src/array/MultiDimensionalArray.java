package array;

public class MultiDimensionalArray {

	public static void main(String[] args) {

		String[][] data = new String[5][2];

		data[0][0] = "Prachee";
		data[1][0] = "Ajinkya";
		data[2][0] = "Sneha";
		data[3][0] = "Amit";
		data[4][0] = "Anand";

		for (int j = 0; j < 5; j++) {
			data[j][1] = "password" + j;
		}

		for (int r = 0; r < data.length; r++) {
			for (int c = 0; c < data[r].length; c++) {
				System.out.print(data[r][c] + "\t");
			}
			System.out.println();
		}
	}

}
