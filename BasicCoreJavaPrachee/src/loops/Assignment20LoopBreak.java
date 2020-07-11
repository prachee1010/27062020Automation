package loops;

public class Assignment20LoopBreak {

	public static void main(String[] args) {

		// What will be the output of following: 1 to 10 statements
		int x = 0;
		while (true) {
			x = increment(x);

			System.out.println("Value of x is --" + x);

			if (x > 10)
				break;

		}
	}

	public static int increment(int i) {
		return i + 1;
	}

}
