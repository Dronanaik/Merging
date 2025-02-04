package abstraction;

public class Test {

	public static void main(String[] args) {
		//Person p1=new Person();
		Person p1=new Employee();
		Person p2=new Student();
		Student ss=new Student();
		Employee e=new Employee();
		Player ee=new Employee();
		Artist aa=new Employee();
		aa.art();
		Person[] pList=new Person[3];
		
		pList[0]=p1;
		pList[1]=p2;
		pList[2]=ss;
		
	}

}
