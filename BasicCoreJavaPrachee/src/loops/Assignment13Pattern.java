package loops;

public class Assignment13Pattern {

	public static void main(String[] args) {

//		1
//		12
//		1234
//		12345
//		123456
//		1234567
		
		for (int r = 1; r<=7; r++) {
			for (int c = 1; c<=r; c++) {
				System.out.print(c);
			}
			System.out.println();
		}

	}

}
