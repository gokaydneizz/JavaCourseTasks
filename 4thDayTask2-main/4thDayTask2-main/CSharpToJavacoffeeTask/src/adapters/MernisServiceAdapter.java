package adapters;

import java.rmi.RemoteException;

import Entity.concretes.Customer;
import business.abstracts.CustomerCheckService;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	KPSPublicSoapProxy client = new KPSPublicSoapProxy();
	boolean result = false;
	
	
	@Override	
	public boolean CheckIfRealPerson(Customer customer) {
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId())
											,customer.getFirstName(),
											 customer.getLastName(),
											 customer.getDateOfBirth().getYear());
			}
		   catch (Exception e) 
		{	
			System.out.println("Not a valid person by Adapter.");
		}		
		return result;	
		
		
	}
		
}		
	


