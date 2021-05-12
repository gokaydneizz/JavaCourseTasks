
public class InstructorManager extends UserManager{
	@Override
	public void whatIsMyUserName(User user) {
		
	}
	@Override
	public void whatIsMyPassword(User user) {
		
	}
	
	public void whatIsMyLessonToday(Instructor instructor) {
		System.out.println("The lesson you will give today is : " + instructor.givenLesson);
	}

}
