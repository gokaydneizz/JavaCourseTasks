package business.concretes;

import Entity.concretes.Customer;
import business.abstracts.CustomerService;

public class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to database : " + customer.getFirstName());
		
	}

}
