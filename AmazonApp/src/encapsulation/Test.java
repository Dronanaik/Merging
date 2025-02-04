package encapsulation;

public class Test {

	public static void main(String[] args) {
		Car c=new Car();
		c.setSpeed(123);
		System.out.println(c.getSpeed());
		
		c.setDoors(1234567);

	}

}
