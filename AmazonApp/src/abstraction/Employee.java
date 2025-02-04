package abstraction;

public class Employee extends Person implements Artist,Player{
	int empId; 
	public Employee() {}
	public Employee(String name,int age,int empId)
	{
		super(name,age);
		this.empId=empId;
		System.out.println("Employee created");
	}
	@Override
	public void play() {
		// TODO Auto-generated method stub		
	}
	@Override
	public void coach() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void art() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void do1() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
