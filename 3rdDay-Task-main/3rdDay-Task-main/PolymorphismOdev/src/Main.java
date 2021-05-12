
public class Main {

	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		instructor.userName = "EnginDemirog459";  
		instructor.password = 123456789;  	//Buyukguvenlikzaafiyeti
		instructor.givenLesson = "Java Kursu";
		
		Student student = new Student();
		student.userName = "quALynn--";
		student.password = 15312398;
		student.takenLesson = "Java Kursu";
		
		
		UserManager manager = new UserManager();
		
		manager.whatIsMyUserName(student);
		manager.whatIsMyPassword(student);
		
		System.out.println("------------------");
		
		manager.whatIsMyUserName(instructor);
		manager.whatIsMyPassword(instructor);
		
		
		System.out.println("------------------");
		
		
		StudentManager studentManager = new StudentManager();
		studentManager.chooseLesson(student);
		
		System.out.println("------------------");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.whatIsMyLessonToday(instructor);
		
		
		
		
		
		
		

	}

}
