package StaticFinal;

public class Test {
	public static void main(String[] args) {
		Sample obj1 =new Sample();
		obj1.x =10;
		obj1.x++;
		System.out.println(obj1.x);
		Sample obj2 =new Sample();
		obj2.x =20;
		obj1.x++;
		System.out.println(obj2.x);
		Sample obj3 =new Sample();
		obj3.x =30;
		obj1.x++;
		System.out.println(obj3.x);
		
		
		Sample.y =100;
		Sample.y++;
		System.out.println(Sample.y);
		Sample.y++;
		System.out.println(Sample.y);
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		
		System.out.println(Employee.noOfEmployees);
		System.out.println(Employee.nameOfOrg);
		
		Employee.nameOfOrg="New KPMG";
		System.out.println(Employee.nameOfOrg);
	}

}
