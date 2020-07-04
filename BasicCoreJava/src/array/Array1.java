package array;

public class Array1 {

	public static void main(String[] args) {

		String[] name = new String[5];
		name[0] = "Prachee";
		name[1] = "Ajinkya";
		name[2] = "Sneha";
		name[3] = "Amit";
		name[4] = "Anand";
		
		System.out.println(name.length);
		for (int i=0; i<name.length; i++)
		{
			System.out.println(name[i]);
		}
		
//		for (int i=0; i<2; i++)
//		{
//			name[i] = "prachee"+i;
//		}
		
	}

}
