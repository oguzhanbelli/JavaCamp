package kodlamaioOdev;

public class Main {

	public static void main(String[] args) {

		Lesson lesson1 = new Lesson(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp�",
				"2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.",
				"Engin Demiro�", "�cretsiz");
		
		Lesson lesson2 = new Lesson();
		lesson2.id = 2;
		lesson2.desc = "2 ay s�recek �cretsiz ve profesyonel bir programla, s�f�rdan yaz�l�m geli�tirme ��reniyoruz.";
		lesson2.instructor = "Engin Demiro�";
		lesson2.title = "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA & REACT)";
		lesson2.price = "�cretsiz";
		Lesson lesson3 = new Lesson(3, "Programlamaya Giri� ��in Temel Kurs",
				"PYTHON, JAVA, C# gibi t�m programlama dilleri i�in temel programlama mant���n� anla��l�r �rneklerle ��renin.",
				"Engin Demiro�", "�cretsiz");

		Lesson[] lesson = { lesson1,lesson2,lesson3 };

		for (Lesson lessons : lesson) {
			System.out.println(lessons.title);
			System.out.println(lessons.desc);
			System.out.println(lessons.instructor);
			System.out.println(lessons.price);
		}
		
		LessonManager lessonManager = new LessonManager();
		
		lessonManager.EnterTheProgram(lesson1.id,lesson1.title);
		lessonManager.EnterTheProgram(lesson2.id,lesson2.title);
		lessonManager.EnterTheProgram(lesson3.id,lesson3.title);
		
		lessonManager.QuitTheProgram(lesson2.id, lesson2.title);
		

	}

}
