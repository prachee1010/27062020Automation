package functions;

public class CallVariables {

	public static void main(String[] args) {

		//System.out.println(Variables.name);		//Prachee from Variables
		
		Variables obj = new Variables();		
		//System.out.println(obj.name2);		//Anand from Varibles
		
		obj.name = "Ajink";					//updates value of name of all objs
		obj.name2 = "Sneha";				//updates value of name2 of obj
		
		Variables obj2 = new Variables();
		System.out.println(Variables.name);
		System.out.println(obj2.name);	
		System.out.println(obj.name2);
		System.out.println(obj2.name2);
	}

}
