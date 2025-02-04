package products;

public class Mobile {
	String brand;
	String color;
	int RAM;
	float price;
	
	//accepts nothing returns nothing
	public void displayInfo()
	{
		System.out.println(brand+" "+color+" "+RAM+" "+price);
	}
	//accepts nothing returns something
	public float getDiscount()
	{
		String xx;
		System.out.println("hello");
		return (price-(price*10/100));
	}
	//accepts something returns something
	public float getDiscountedValue(float x)
	{
		return (price-(price*x/100));
	}
	public String getBrand()
	{
		return brand;
	}
}
