package kodlamaioOdev2;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1, "O�uzhan", "Belli", "oguzhanbelli@gmail.com", "123456");
		User user2 = new User(2, "O�uzhan", "Be", "oguzhanbe@gmail.com", "1234567");
		User[] users = {user1,user2};
		UserManager userManager = new UserManager();
		userManager.List(users);
		BaseManager[] managers =  new BaseManager[] {new UserManager(),new StudentManager(),new InstructorManager()};
		for(BaseManager manager : managers) {
             	manager.add("Ekleme Mesaj�");
		}
		Student student = new Student();
		student.setId(1);
		student.setFirstName("O�uzhan");
		student.setLastName("Belli");
		student.setEmail("oguzhanbelli@gmail.com");
		student.setPassword("123456");
		student.setAddress("Bursa");
		student.setStudentNumber(1);
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demiro�");
		instructor.setEmail("engindemirog@gmail.com");
		instructor.setInstructorNumber("1");
		instructor.setPassword("123456");
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add("Selam");
		StudentManager studentManager = new StudentManager();
		studentManager.add("Selam");
		studentManager.bestStudent(student);

	}

}
