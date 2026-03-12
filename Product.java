/*
 * Name: Gabriella Bruno
 * Project 1
 * Title: Product.java
 * Description: class that outlines what a product is, with variables and methods
 * Date: 2/8/25
 * 
 */

public class Product {

	//instance variables
	private String name;
	private String sku;
	private double cost;
	private int quantity;
	
	//static variable
	private static int totalNumberOfProducts = 0;
	
	//default constructor
	public Product() {
		name = "";
		sku = "";
		cost = 0.0;
		quantity = 0;
		totalNumberOfProducts++;
	}
	
	//overloaded constructor
	public Product(String n, String s, double c, int q) {
		name = n;
		sku = s;
		cost = c;
		quantity = q;
		totalNumberOfProducts++;
	}
	
	//copy constructor (deep copy)
	public Product(Product newProduct) {
		this.name = newProduct.name;
		this.sku = newProduct.sku;
		this.cost = newProduct.cost;
		this.quantity = newProduct.quantity;
		totalNumberOfProducts++;
	}

	//get and set methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSKU() {
		return sku;
	}

	public void setSKU(String sku) {
		this.sku = sku;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	//toString
	public String toString() {
		String x = "Product Info: \nProduct: " + name + "\nSKU Number: " + sku + "\nCost: " + cost + "\nQuantity: " + quantity + "\n";
		return x;
	}
	
	//equals method
	public boolean isEqual(Product newProduct) {
		if (newProduct.getSKU().equals(this.getSKU())) {
			return true;
		} else {
			return false;
		}
	}
	
	//static method
	public static int getTotalNumberOfProducts() {
		return totalNumberOfProducts;
	}
	
}//end class
