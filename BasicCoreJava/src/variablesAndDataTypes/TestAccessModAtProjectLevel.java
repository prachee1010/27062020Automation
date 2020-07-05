package variablesAndDataTypes;
import functions.AccessModifiers;

public class TestAccessModAtProjectLevel extends AccessModifiers {

	public static void main(String[] args) {
		
		AccessModifiers obj = new AccessModifiers();
		obj.publicFunction();
		//obj.privateFunction();		Not accessible
		//obj.protectedFunction();		Not accessible, Can be accessed using object of child class
		//obj.defaultFunction();		Not accessible
		
		TestAccessModAtProjectLevel obj_child = new TestAccessModAtProjectLevel();
		obj_child.protectedFunction();

	}

}
