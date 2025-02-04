package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Sample3 {

	public static void main(String[] args) {
		try {
		int x=10;
		int y=2;
		int z=x/y;
		System.out.println(z);
		System.out.println("Phase 1 completed");
		FileReader fr = new FileReader("myfile.txt");
		}catch(ArithmeticException e)
		{
			System.out.println("number exception");
			System.out.println(e.getMessage());
		}catch(FileNotFoundException e)
		{
			System.out.println("File Not Found Exception ERROR");
			System.out.println(e.getMessage());
		}


	}

}
