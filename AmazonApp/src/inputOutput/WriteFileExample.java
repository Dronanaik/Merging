package inputOutput;

import java.io.FileWriter;
import java.io.IOException;



public class WriteFileExample {
	public static void main(String[] args) {
		try (FileWriter fr = new FileWriter("MyFile.txt",true)) {
			String content="It's my file";
			fr.write(content);
			fr.flush();
			System.out.println("done");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}