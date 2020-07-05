package functions;

public class TestAccessModAtPackageLevel {

	public static void main(String[] args) {

		AccessModifiers obj = new AccessModifiers();
		obj.publicFunction();
		//obj.private			Not accessible
		obj.protectedFunction();
		obj.defaultFunction();
	}

}
