package inheritance;

public class Employee extends Person {
	int empId; 
	public Employee() {}
	public Employee(String name,int age,int empId)
	{
		super(name,age);
		this.empId=empId;
		System.out.println("Employee created");
	}
//	public void show()
//	{
//		System.out.println(name+" "+age+" "+empId);
//	}
}
