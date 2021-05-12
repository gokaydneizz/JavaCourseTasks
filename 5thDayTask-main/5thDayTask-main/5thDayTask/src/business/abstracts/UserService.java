package business.abstracts;

import entities.concretes.User;

public interface UserService {
	void LogIn(User user);
	void Register(User user);
	void sendVerificationCode(User user);
	void DoubleClick();	
	boolean verificateEmail(User user);
	boolean multipleMailVerification(String email);
	
	
	
	
	
}
