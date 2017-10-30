package order;

public class Product {
	
	private String name;
	private Double price;
	private int productID;

	public Product(String name_, Double price_, int productID_)
	{
		System.out.println("called Product class");
		this.name = name_;
		this.price = price_;
		this.productID = productID_;
	}
	
	public String getName()
	{
		System.out.println("called Product class");
		return this.name;
	}
	
	public Double getPrice()
	{
		System.out.println("called Product class");
		return price;
	}
	
	public int getProductID()
	{
		System.out.println("called Product class");
		return productID;
	}
}
