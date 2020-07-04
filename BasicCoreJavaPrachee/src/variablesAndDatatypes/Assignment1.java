package variablesAndDatatypes;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=10, b=20;
		
		System.out.print("a="+a+" ");//10
		System.out.println("b="+b);//20
		//code
		int c;
		c=b;
		b=a;
		a=c;
		
		System.out.print("a="+a+" ");//20
		System.out.println("b="+b);//10
	}

}
