package order;

public class OrderLine {
	
	private int quantity;
	private Double price;
	private Product product;
	
	public OrderLine(Product product_, int quantity_, Double price_)
	{
		System.out.println("OrderLine info");
		this.quantity = quantity_;
		this.price = price_;
		this.product = product_;
	}
	
	public Product getProduct()
	{
		System.out.println("OrderLine info");
		return this.product;
	}
	
	public int getQuantity()
	{
		System.out.println("called OrderLine class info");
		return this.quantity;
	}
	
	public Double getPrice()
	{
		System.out.println("called OrderLine class info");
		return this.price;
	}
}
