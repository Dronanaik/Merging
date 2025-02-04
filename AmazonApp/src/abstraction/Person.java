package abstraction;

public abstract class Person {
	//it can not be instantiated
	//it contains zero or more abstract methods
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
	public abstract void doSomething(); 
	
	

}
