package core;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



import entities.concretes.User;

public class ValidatorManager implements Validator{
	
	@Override
	public boolean valEmail(User user) {
		String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$"; 
		Pattern emailPat = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
		Matcher matcher = emailPat.matcher(user.geteMail());
		return matcher.find();
	}
	
	

}
