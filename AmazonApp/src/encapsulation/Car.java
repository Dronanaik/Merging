package encapsulation;

public class Car {
	//private dataint 
	private int speed;
	private String make;
	private int wheels;
	public int doors;
	
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	//public code
	public Car(int speed, String make, int wheels) {
		super();
		this.speed = speed;
		this.make = make;
		this.wheels = wheels;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed>300)
			System.out.println("Invalid speed");
		else
			this.speed=speed;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	
	

}
