package exceptions;

public class Sample2 {

	public static void main(String[] args) {
		try {
		int x=10;
		int y=2;
		int z=x/y;
		System.out.println(z);
		System.out.println("Phase 1 completed");
		int[] num=new int[3];
		num[2]=100;
		System.out.println("Phase 2 completed");
		}catch(ArithmeticException e)
		{
			System.out.println("number exception");
			System.out.println(e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("array exception");
			System.out.println(e.getMessage());
		}catch(Exception e)
		{
			System.out.println("some problem");
			System.out.println(e.getMessage());
		}finally
		{
			System.out.println("No matter what I will get executed");
		}


	}

}
