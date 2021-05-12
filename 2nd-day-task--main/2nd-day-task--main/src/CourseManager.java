
public class CourseManager {
	public void Add(Courses course) {
		System.out.println("Kurs eklendi eklenen kurs : " + course.courseName);
	}
	
	public void Delete(Courses course) {
		System.out.println("Kurs silindi silinen kurs : " + course.courseName);
	}
}
