package stringClass;

public class Assignment {

	public static void main(String[] args) {

		String str = "Anand";

		int count=0;
/*		for (int iter=0; iter<str.length(); iter++) {
			if(str.charAt(iter)=='a' || str.charAt(iter)=='A') {
				count++;
			}
		}
		*/
		
		String[] name = str.split("");

		for(String c : name) {
			if(c.equalsIgnoreCase("A")) {
				count++;
			}
		}
		
		System.out.println(count);
	}

}
