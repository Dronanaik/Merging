package threads;

public class TestSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintEven obj = new PrintEven();
		Sample sam1 = new Sample(obj);
		Sample sam2 = new Sample(obj);
		sam1.start();
		sam2.start();

	}

}
