package serialization;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class Test {
	public static void main(String[] args) {
		Product prod1 = new Product(1001, "TV", 95000, "Samsung");
		try {
			FileOutputStream fileOut = new FileOutputStream("prodUppuObject.txt");
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			
			FileInputStream fileIn = new FileInputStream("prodUppuObject.txt");
			ObjectInputStream objectIn = new ObjectInputStream(fileIn);
			
			objectOut.writeObject(prod1);//object -> stream of bytes
			objectOut.flush();
			System.out.println("Object is serialized");
			//Product copyProd2=new Product()	
		
			Product copyProd1=(Product)objectIn.readObject();//Stream of byte->Object
			
			System.out.println(copyProd1.getProdId());
			System.out.println(copyProd1.getBrand());
			System.out.println(copyProd1.getPrice());
			System.out.println(copyProd1.getName());
			System.out.println("Object recreated successfully");			
		}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
