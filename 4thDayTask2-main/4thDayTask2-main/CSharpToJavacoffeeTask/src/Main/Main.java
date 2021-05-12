package Main;

import Entity.concretes.Customer;
import adapters.MernisServiceAdapter;
import business.abstracts.CustomerCheckService;
import business.abstracts.CustomerService;
import business.concretes.BaseCustomerManager;
import business.concretes.CustomerCheckManager;
import business.concretes.NeroCustomerManager;
import business.concretes.StarbucksCustomerManager;

import java.time.LocalDate;


public class Main {

	public static void main(String[] args) {
		
		
		BaseCustomerManager manager = new NeroCustomerManager();
		Customer customer = new Customer(1, "Engin", "Demirog",LocalDate.of(1985,11,21),"10038032512");			
		manager.save(customer);
		
		System.out.println("---------");
		
		
		
		BaseCustomerManager manager1 = new StarbucksCustomerManager(new MernisServiceAdapter());
		manager1.save(new Customer(1,"Gokay","Erdem",LocalDate.of(1998,12,20),"10038232123"));
			
		

	}

}
