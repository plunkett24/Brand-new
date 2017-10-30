package order;

public class CorporateCustomer extends Customer
{
	public CorporateCustomer(String name_, String address_, float creditRating_, float discountRating_) {
		super(name_, address_, creditRating_, discountRating_);

	}

	private String contactName;
}
