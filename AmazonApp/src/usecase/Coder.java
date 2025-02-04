package usecase;

public class Coder extends Employee{

	@Override
	public void calSal() {
		this.salary=200+this.salary;
		System.out.println(this.salary);
		
	}

}
