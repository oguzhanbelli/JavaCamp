package kodlamaioOdev;

public class Lesson {
	public Lesson() {

	}
	public Lesson(int id, String title, String desc, String instructor, String price) {
		this();
		this.id = id;
		this.title = title;
		this.desc = desc;
		this.instructor = instructor;
		this.price = price;

	}

	int id;
	String title;
	String desc;
	String instructor;
	String price;

}
