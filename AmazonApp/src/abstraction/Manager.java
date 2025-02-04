package abstraction;

public class Manager extends Employee{
	String team;
	public Manager() {}
	public Manager(String name,int age,int empId,String team)
	{
		//super();
		super(name,age,empId); //call constructor of super class
		this.team=team;
		System.out.println("Manager created");
	}
	public void show()
	{
		System.out.println(name+" "+age+" "+empId+" "+team);
	}

}
