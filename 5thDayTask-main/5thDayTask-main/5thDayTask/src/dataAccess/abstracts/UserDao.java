package dataAccess.abstracts;

import entities.concretes.User;

public interface UserDao {
	void login(User user);
	void register(User user);
	
}
