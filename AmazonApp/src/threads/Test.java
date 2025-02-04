package threads;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1 = new MyThread();
		t1.start();//Calls the run method
		
		MyTask tsk1 = new MyTask();
		Thread t2 = new Thread(tsk1);
		t2.start();

	}

}
