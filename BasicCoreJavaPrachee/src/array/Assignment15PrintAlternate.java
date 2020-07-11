package array;

public class Assignment15PrintAlternate {

	public static void main(String[] args) {

		// Print alternate elements of String array

		String[] names = { "Prachee", "Anand", "Ajinkya", "Amit", "Sneha", "Anshika", "Nishka" };
		for (int i = 0; i <= names.length; i += 2) {
			System.out.print(names[i] + " ");
		}
	}

}
