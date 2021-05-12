package business.concretes;

import java.util.ArrayList;
import java.util.List;

import business.abstracts.UserService;
import core.Validator;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService{
	private UserDao userdao;	
	private Validator validator;
	List<User> users = new ArrayList<User>();
	
	
	
	public UserManager(UserDao userdao, Validator validator) {
		super();
		this.userdao = userdao;
		this.validator = validator;
	}


	@Override
	public void LogIn(User user) {
		if(verificateEmail(user)==false) {
			System.out.println("Check if your e mail is in correct form.");
			return;
		}
		if(user.getPassword().length() < 6) {
			System.out.println("Check if your password is in correct form.");
			return;
		}if(!user.getName().isEmpty() && !user.getPassword().isEmpty() && !user.geteMail().isEmpty()) {
			this.userdao.login(user);
		}
		
	}
		
	@Override
	public void Register(User user) {
		if(verificateEmail(user)==false) {
			System.out.println("Check if your e mail is in correct form.");
			return;
		}if(user.getPassword().length() < 6) {
			System.out.println("Process has failed.Your password should contain more than 6 characters.");
			return;
		}if(user.getName().length() <= 2 || user.getLastName().length() <= 2) {
			System.out.println("Process has failed.Your Name or Lastname should contain at least 2 characters.");
			return;
		}if(multipleMailVerification(user.geteMail())){
			System.out.println("This e mail address has already taken.");
		}								
			this.userdao.register(user);
			sendVerificationCode(user);
			DoubleClick();
		
		
		
			
	}
		
	


	

	
	@Override	
	public void sendVerificationCode(User user) {
		System.out.println("Your verification code was sent if you double click this message,your registration will be completed.");		
	}

		
			

	@Override
	public boolean verificateEmail(User user) {
	if(validator.valEmail(user) == true && !user.geteMail().isEmpty()) {
		return true;
	}
	return false;	
	}

	
	

	@Override
	public void DoubleClick() {
		System.out.println("Your verification has been completed."  + " Now you're ready to surf on our website!");
		
	}


	@Override
	public boolean multipleMailVerification(String email) {
		return false;
	}





	
	


	


	

	


	
	
}
