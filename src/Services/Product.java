package Services;

import java.util.Objects;

public class Product {

	private String name;
	private Double price;
	
	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public static String staticToUppercase(Product p) {
		return p.getName().toUpperCase();
	}
	
	public String nonStaticToUppercase() {
		return name.toUpperCase();
	}
	
	@Override
	public String toString() {
		return "Product [name = " + name + ", price = " + String.format("%.2f",price) + "]";
	}
	
	
	
}
