package kodlamaioOdev2;

public class StudentManager extends BaseManager {
	public void bestStudent(Student student) {
		System.out.println("En ba�ar�l� ��renci " + student.getFirstName() +" "+ student.getLastName());
		
		
		
	}
	public void add(String message) {
		System.out.println("��renci Eklendi "+message);
	}

}
