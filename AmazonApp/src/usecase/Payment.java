package usecase;

public class Payment {
	public void getFinalSal(Employee e) {
		if (e instanceof Designer) {
			e.salary = e.salary + 200;
			System.out.println(e.salary);
		} else if (e instanceof Designer) {
			e.salary = e.salary + 300;
			System.out.println(e.salary);
		}
	}

}
