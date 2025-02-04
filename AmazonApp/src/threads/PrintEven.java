package threads;

public class PrintEven {
	static int i;
	public synchronized void getValue() {
	for(i=0;i<=20;i=i+2)
	{
		System.out.println(i);
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

}
