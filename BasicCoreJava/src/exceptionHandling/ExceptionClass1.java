package exceptionHandling;

public class ExceptionClass1 {

	public static Functions fun;	//it is reference, default value null
	
	public static void main(String[] args) {

		
		
/*		//1st Exception
		int a=10, b=0;
		System.out.println(a/b);
		*/
		
/*		//2nd ArrayIndexOutOfBoundsException
		String[] str = new String[2];
		str[2] = "Prachee";*/
		
		//3rd Exception NullPointerException
		fun.fun1();		//bcz obj is not created default value of fun is null
		
	}

}
