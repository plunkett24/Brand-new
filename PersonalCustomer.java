package order;

public class PersonalCustomer extends Customer
{
	
	public PersonalCustomer(String name_, String address_, float creditRating_, float discountRating_) {
		super(name_, address_, creditRating_, discountRating_);
	}

	private int creditCardNumber;
}
