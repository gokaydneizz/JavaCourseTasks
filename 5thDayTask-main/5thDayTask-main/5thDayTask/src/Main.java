
import java.util.ArrayList;
import java.util.List;

import business.abstracts.UserService;
import business.concretes.UserManager;
import core.ValidatorManager;
import entities.concretes.User;
import dataAccess.abstracts.*;
import dataAccess.concretes.*;

public class Main {

	public static void main(String[] args) {
		
		User user2 = new User("Galip","Canturk","galip123@gmail.com","galip123");
		User user3 = new User("Mahmut","Evren","galip123@hibernate.com","galip12");
		
		
		UserService service = new UserManager(new LoginWithGmailManager(),new ValidatorManager());
		
		
		service.Register(user2);
		
		System.out.println("-----------------");
		
		
		service.LogIn(user2);
		
		System.out.println("------------------");
		
		UserService service2 = new UserManager(new LoginWithHibernateManager(),new ValidatorManager());
		
		service2.Register(user3);
		
		System.out.println("-------");
		
		service2.LogIn(user3);
		
		
				
		
		
		

		
		
		

		
		

	}

}
