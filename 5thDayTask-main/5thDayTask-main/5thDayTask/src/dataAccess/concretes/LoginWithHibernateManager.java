package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class LoginWithHibernateManager implements UserDao {

	@Override
	public void login(User user) {
		System.out.println("You have successfully logged in to our website with your hibernate mail : " + user.geteMail());
		
	}

	@Override
	public void register(User user) {
		System.out.println("You have successfully registered to our website with your hibernate mail : " + user.geteMail());
		
	}

}
