package order;

import java.util.*;

public class ProductCatalogue implements Iterable<Product> {
		private ArrayList<Product> Products = new ArrayList<Product>();
		
		public ProductCatalogue()
		{
			System.out.println("called ProductCatalogue class");
		}
		
		public void addProduct(String name_, Double price_, int productID_)
		{
			System.out.println("called ProductCatalogue class");
			
			Product product = new Product(name_, price_, productID_);
			Products.add(product);
		}
		
		@Override
		public Iterator<Product> iterator()
		{
			System.out.println("called ProductCatalogue class");
			return Products.iterator();
		}
}
