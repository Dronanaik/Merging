package StaticFinal;

public class Employee {
	String name;
	static String nameOfOrg = "KPMG";
	static int noOfEmployees = 100;
	public Employee()
	{
		noOfEmployees++;
	}

}
