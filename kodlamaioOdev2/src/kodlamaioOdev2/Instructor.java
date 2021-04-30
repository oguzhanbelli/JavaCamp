package kodlamaioOdev2;

public class Instructor extends User {
	private String instructorNumber;

	public Instructor() {

	}

	public Instructor(String instructorNumber) {
		this.instructorNumber = instructorNumber;
	}

	public String getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(String instructorNumber) {
		this.instructorNumber = instructorNumber;
	}

}
