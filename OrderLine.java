package order;

public class OrderLine {

	private int quantity;
	private Double price;
	private Product product;

	public OrderLine(Product product_, int quantity_, Double price_)
	{
		//System.out.println("called OrderLine class");
		this.quantity = quantity_;
		this.price = price_;
		this.product = product_;
	}

	public Product getProduct()
	{
		//System.out.println("called OrderLine class");
		return this.product;
	}

	public int getQuantity()
	{
		//System.out.println("called OrderLine class");
		return this.quantity;
	}

	public Double getPrice()
	{
		//System.out.println("called OrderLine class");
		return this.price;
	}

	public void setPrice(Double price_)
	{
		this.price = price_;
	}

	public void setQuantity(int quantity_)
	{System.out.println("Changes made for Assignment5");
		this.quantity = quantity_;
	}
}