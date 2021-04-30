package kodlamaioOdev2;

public class Student extends User {
	private int studentNumber;

	private String address;

	public Student() {

	}

	public Student(int studentNumber, String address) {
		super();
		this.studentNumber = studentNumber;
		this.address = address;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
