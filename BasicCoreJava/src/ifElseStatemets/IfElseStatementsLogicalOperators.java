package ifElseStatemets;

public class IfElseStatementsLogicalOperators {

	public static void main(String[] args) {
		
	//And operator
		int age = 25;
		boolean voter_id = true;
		
		if(age>=18 && voter_id)
		{
			System.out.println("You are eligible to vote!");
		}else {
			System.out.println("You are not eligible to vote!");
		}

	//OR operator
		boolean PanCard = true,
				AadharCard = true;
		
		if(PanCard || AadharCard)
		{
			System.out.println("Account can be opened!");
		}else {
			System.out.println("Account cannot be opened!");
		}
	}

}
