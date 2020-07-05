package functions;

public class Function1SignatureOfFunction {

	public static void main(String[] args) {

		sum();
		
	}
	/*
	
	//access modifier	Nature of method	Return type 		name				parameters
	public				static 				void				any except 			any datatype
	private 			(no keyword 		any datatype 		reserved keywords
	protected			i.e nonstatic)		(primitive & 
											nonprimitive)
	 */
	
	
	public 				static 				void 		sum		() { 		// Signature of method
		
		int a = 10, b = 20;
		 System.out.println(a+b);
		 
		 int c = 30;
		 
		 System.out.println(b+c);
		int d = 40, e = 50;
		System.out.println(d+e);
	}
}
