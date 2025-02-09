package serialization;

import java.io.Serializable;

public class Product implements Serializable{
	private static final long serialVersionUID = 1234567890L;
	public int prodId;
	public String name;
	public transient int price;
	public String brand;
	public Product(int prodId, String name, int price, String brand) {
		super();
		this.prodId = prodId;
		this.name = name;
		this.price = price;
		this.brand = brand;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
		
}