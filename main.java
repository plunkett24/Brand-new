package order;

import java.util.*;

public class main {

	public static void main(String[] args) {
		Customer customer = new Customer("Jamie Plunkett", "34-49 munroe place", 0.00f, 0.00f);
		double price = 0.0;

		Order order = new Order(customer);
		OrderApplication App = new OrderApplication();

		if (App.createOrder(order)) {
			price = order.calculatePrice();
			System.out.printf("The price of the order is $%.2f\n", price);
		}

		do {
			System.out.println("Changes made to Assignment5");
			System.out.printf("The current order is:\n");
			order.printOrder();

			Scanner read = new Scanner(System.in);
			char input = 0;

			do {
				System.out.printf("press 1 to delete an order line, press 2 to change the quantity of an order line: ");
				input = read.next().charAt(0);
			} while ((input != '2' && input != '1'));

			if (input == '1') {
				System.out.printf("Enter the orderline ID to remove: ");
				String index = read.next();

				if (order.removeOrderItem(Integer.parseInt(index) - 1) != null) {
					System.out.printf("Successfully removed");
				}
			}

			else if (input == '2')
			{
				System.out.printf("Enter the orderline ID:" );
				int index = Integer.parseInt(read.next());

				if (index <= order.OrderCount() && index != 0)
				{
					System.out.printf("Enter the new quantity: ");
					int quantity = Integer.parseInt(read.next());

					order.setQuantity(index - 1,  quantity);
				}
			}

		} while (true);


	}
}