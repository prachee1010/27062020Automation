package functions;

public class CarUser {

	public static void main(String[] args) {

		Car car1 = new Car();
		
		car1.color="Blue";
		car1.capacity=6;
		car1.features();
		
		
		Car car2 = new Car();
		car2.color="Black";
		car2.capacity=5;
		car2.features();
		
		Car car3 = new Car();
		car3.color="Grey";
		car3.capacity=7;
		car3.features();
		
		Car car4 = new Car("White", 5);
		car4.features();
	}

}
