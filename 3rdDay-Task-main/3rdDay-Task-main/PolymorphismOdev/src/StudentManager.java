
public class StudentManager extends UserManager {
	@Override
	public void whatIsMyUserName(User user) {
		
	}
	@Override
	public void whatIsMyPassword(User user) {
		
	}
	
	public void chooseLesson(Student student) {
		System.out.println("The lesson you have choosen is : " + student.takenLesson);
	}
}
