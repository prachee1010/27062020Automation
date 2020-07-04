package ifElseStatements;

public class IfElseClass3NestedIfStatements {

	public static void main(String[] args) {

//		int a = 30, b = 10, c = 20;				// a is greatest c>b
//		int a = 30, b = 20, c = 10;				// a is greatest b>c

//		int a = 20, b = 30, c = 10;				// b is greatest a>c
//		int a = 10, b = 30, c = 20;				// b is greatest c>a
		
//		int a = 20, b = 10, c = 30;				// c is greatest a>b
		int a = 10, b = 20, c = 30;				// c is greatest b>a
		
		
		if (a>b) 
		{
			if (b>c)
			{
				System.out.println("a is greatest!  b>c");
			}else if (a>c)					 
				{
					System.out.println("a is greatest! c>b");
			}else {
				System.out.println("c is greatest! a>b");
			}
		}else if (b>a){
			if (a>c)
			{
					System.out.println("b is greatest! a>c");
			}else if (b>c){
					System.out.println("b is greatest! c>a");
			}else {
				System.out.println("c is greatest! b>a");
			}
			
		}
	}

}
