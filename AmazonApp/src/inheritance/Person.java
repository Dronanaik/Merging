package inheritance;

public class Person {
	String name;
	int age;
	public Person() {System.out.println("Person created");}
	public Person(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println("Person created");
	}
	public void show()
	{
		System.out.println(name+" "+age);
	}
	

}
