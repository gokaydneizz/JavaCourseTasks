
public class MainClass {

	public static void main(String[] args) {
		Courses course1 = new Courses();
		course1.courseId = 1;
		course1.courseName = "Java Kursu";
		course1.instructorName = "Engin Demirog";
		
		Courses course2 = new Courses(2,"Engin Demirog","C# Kursu");
		
		
		Courses course3 = new Courses(3,"Engin Demirog","Programlamaya giris kursu");
		
		Courses[] courses = {course1,course2,course3};
		
		for(Courses course:courses) {
			System.out.println(course.courseName);
		}
		
		
		System.out.println("-----------------");
		
		Category category1 = new Category(1,"Programlama",3);
		
		Category category2 = new Category();
		category2.categoryID =2;
		category2.categoryName = "Tumu";
		
		Category[] categories = {category1,category2};
		
		for(Category category:categories) {
			System.out.println(category.categoryName);
		}
		
		CourseManager manager = new CourseManager();
		
		manager.Add(course3);
		manager.Delete(course3);

	}

}
