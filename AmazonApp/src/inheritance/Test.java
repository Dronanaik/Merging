package inheritance;

public class Test {

	public static void main(String[] args) {
		//Person p1=new Person();
		//Employee e1=new Employee();
//		Manager m1=new Manager("Uppu",16,1001,"Training");
//		System.out.println(m1.name);System.out.println(m1.empId);
//		System.out.println(m1.age);System.out.println(m1.team);
		Person p1=new Person("Uppu",23);
		Employee e1=new Employee("Arjun",11,1001);
		Manager m1=new Manager("MUnzer",11,1001,"HR");
		p1.show();e1.show();m1.show();
		Employee e2=new Employee();
		e1.show();
	}

}
