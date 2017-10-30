package order;

import java.util.*;

public class Order {

	private Date dateReceived;
	private Double price;
	private int orderID;
	private Customer customer;

	public ArrayList<OrderLine> orderLine = new ArrayList<OrderLine>();

	public Order(Customer customer_)
	{System.out.println("Changes made for Assignment5");
		//System.out.println("called Order class");
		price = 0.00;
		this.orderID = 1; //first order
		dateReceived = new Date(); //todays date.
		this.customer = customer_;
	}

	public Date getDateReceived()
	{
		//System.out.println("called Order class");
		return dateReceived;
	}

	public int OrderCount()
	{
		return orderLine.size();
	}

	public OrderLine removeOrderItem(int index)
	{
		return orderLine.remove(index);
	}

	public Double calculatePrice()
	{
		Iterator<OrderLine> iterator = orderLine.iterator();
		//System.out.println("called Order class");

		while (iterator.hasNext()) {
			OrderLine currentOrder = iterator.next();
			double basePrice = currentOrder.getPrice();
			basePrice = basePrice - (basePrice * customer.getDiscountRating());
			this.price += basePrice;
		}

		return price;
	}

	public void addOrderItem(Product product, int quantity)
	{
		OrderLine newOrder = new OrderLine(product, quantity, product.getPrice() * quantity);
		orderLine.add(newOrder);
	}

	public void setQuantity(int index, int quantity)
	{
		OrderLine order = orderLine.get(index);

		if (order != null)
		{
			order.setQuantity(quantity);
			order.setPrice(quantity * order.getProduct().getPrice());
		}

	}

	public void printOrder()
	{
		Iterator<OrderLine> iterator = orderLine.iterator();
		int i = 0;

		while (iterator.hasNext()) {
			OrderLine currentOrder = iterator.next();
			Product product = currentOrder.getProduct();
			System.out.printf("Orderline ID #: %d | Product Name: %s | Price for each product: $%.2f | Quantity: %d | Total Price: $%.2f\n", i+1, product.getName(), product.getPrice(), currentOrder.getQuantity(), currentOrder.getPrice());
			++i;
		}
	}

}
