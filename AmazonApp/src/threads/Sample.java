package threads;

public class Sample extends Thread{
	
	PrintEven pe;

	public Sample(PrintEven pe) {
		this.pe=pe;
	}
	public void run() {
		pe.getValue();
	}

}
