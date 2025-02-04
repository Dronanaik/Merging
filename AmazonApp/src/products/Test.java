package products;

public class Test {

	public static void main(String[] args) {
		Mobile mobile1=new Mobile();
		mobile1.brand="Samsung";
		mobile1.color="Silver";
		mobile1.RAM=12;
		mobile1.price=140000.00f;
		mobile1.displayInfo();
		float temp1=mobile1.getDiscount();
		float temp2=mobile1.getDiscountedValue(12.55f);
		String temp3=mobile1.getBrand();
		System.out.println(temp1);
		System.out.println(temp2);
		System.out.println(temp3);
		
		System.out.println(mobile1.getDiscount());
		
		


		
	}

}
