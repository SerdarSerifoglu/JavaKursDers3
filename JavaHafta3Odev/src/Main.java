
public class Main {

	public static void main(String[] args) {

		Student student = new Student();
		student.setId(1);
		student.setName("Serdar");
		
		StudentManager studentManager = new StudentManager();
		studentManager.add(student);
		
		Instructor instructor = new Instructor();
		instructor.setId(2);
		instructor.setName("Engin");
		
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor);
	}

}
