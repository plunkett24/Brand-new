package order;

import java.nio.file.Paths;
import java.util.Scanner;
import java.io.IOException;
import java.util.*;

public class OrderApplication {

	private ProductCatalogue Catalogue;

	public OrderApplication() {
		System.out.println("OrderApplication info");
	}
	
	public boolean createOrder(Order oRef) {
		
		boolean success = this.importCatalogue();
		System.out.println("OrderApplication info");
		
		if (success) {
			Iterator<Product> iterator = Catalogue.iterator();
			while (iterator.hasNext()) {
				Product product = iterator.next();
				oRef.addOrderItem(product, 1);
			}
		}

		return success;
	}

	private boolean importCatalogue() {
		boolean success = true;
		Catalogue = new ProductCatalogue();
		Scanner in = null;

		try {
			in = new Scanner(Paths.get("C:\\Users\\Jamie Plunkett\\Desktop\\order-master\\src\\order\\foods.csv"));
		//	C:\Users\Jamie Plunkett\Desktop\order-master\src\order
			in.nextLine();

			while (in.hasNextLine()) {
				String[] ProductData = in.nextLine().split(",");
				Catalogue.addProduct(ProductData[0], Double.parseDouble(ProductData[1]),
						Integer.parseInt(ProductData[2]));
			}

			in.close();

		} catch (Exception IOException) {

			if (in != null)
				in.close();

			success = false;
		}

		return success;
	}
}
