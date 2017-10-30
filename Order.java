package order;

import java.util.*;

public class Order {
	
	private Date dateReceived;
	private Double price;
	private int orderID;
	private Customer customer;
	
	public ArrayList<OrderLine> orderLine = new ArrayList<OrderLine>();

	public Order(Customer customer_) 
	{
		System.out.println("Order Info");
		price = 0.00;
		this.orderID = 1; //first order
		dateReceived = new Date(); //todays date.
		this.customer = customer_;
	}
	
	public Date getDateReceived()
	{
		System.out.println("called Order class");
		return dateReceived;
	}
	
	public Double calculatePrice()
	{
		Iterator<OrderLine> iterator = orderLine.iterator();
		System.out.println("called Order class");
		
		while (iterator.hasNext()) {
			OrderLine currentOrder = iterator.next();
			Product product = currentOrder.getProduct();
			double productPrice = product.getPrice();
			double productQuantity = currentOrder.getQuantity();
			double basePrice = productPrice * productQuantity;
			basePrice = basePrice - (basePrice * customer.getDiscountRating());
			
			this.price += basePrice;
		}
		
		return price;
	}
	
	public void addOrderItem(Product product, int quantity)
	{
		OrderLine newOrder = new OrderLine(product, 1, product.getPrice()); //quantity of 1.
		orderLine.add(newOrder);
	}
	
}
