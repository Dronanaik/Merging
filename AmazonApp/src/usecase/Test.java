package usecase;

public class Test {

	public static void main(String[] args) {
		Employee e1=new Coder();
		e1.salary=20000;
		e1.calSal();
		
		Employee e2=new Designer();
		e2.salary=30000;
		e2.calSal();
		
		Payment p=new Payment();
		p.getFinalSal(e2);
		p.getFinalSal(e2);
		

	}

}
