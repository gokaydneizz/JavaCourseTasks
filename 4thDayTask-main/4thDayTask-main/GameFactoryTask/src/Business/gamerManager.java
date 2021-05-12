package Business;

import Entities.User;

public class gamerManager implements gamerService {
	

	@Override
	public void add(User user) {
		if(verification.verificate(user) == true) {
			System.out.println("An user whose username is: " +
					user.getUserName() + " and whose name is: " + user.getName() + " added  to system.");
		}else{
			System.out.println("User could not be added to system.");
		}
		
	}

	@Override
	public void update(User user) {
		if(verification.verificate(user) == true) {
			System.out.println("An user whose username is: " +
					user.getUserName() + " and whose name is: " + user.getName() + " updated in the system.");
		}else{
			System.out.println("User could not be updated in the system.");
		}
		
	}

	@Override
	public void delete(User user) {
		if(verification.verificate(user)==true) {
			System.out.println("An user whose username is: " + user.getUserName() +
					" and whose name is: " + user.getName() + " deleted from the system.");
		}else {
			System.out.println("User could not be deleted from the system.");
		}
		
	}

}
