package business.concretes;

import Entity.concretes.Customer;

public class NeroCustomerManager extends BaseCustomerManager{
		
	@Override
	public void save(Customer customer) {
		System.out.println("Saved to database : " + customer.getFirstName());
	}

}
