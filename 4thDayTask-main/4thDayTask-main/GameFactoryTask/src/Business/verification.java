package Business;

import Entities.User;

public class verification{

	public static boolean verificate(User user) {
		
		if(user.getNationalId().length() == 11 && user.getBirthDay() <= 2003 && user.getName().length() >= 3 &&
				user.getLastName().length() >= 2) {
			return true;
		}else {
			
			return false;
		}
		
	}
	
	
	

}
