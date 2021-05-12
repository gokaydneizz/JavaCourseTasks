package business.abstracts;

import Entity.concretes.Customer;

public interface CustomerCheckService {

	boolean CheckIfRealPerson(Customer customer); 
}
