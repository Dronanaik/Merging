package usecase;

public class Designer extends Employee {

	@Override
	public void calSal() {
		this.salary=this.salary+100;
		System.out.println(this.salary);
		
	}

}
