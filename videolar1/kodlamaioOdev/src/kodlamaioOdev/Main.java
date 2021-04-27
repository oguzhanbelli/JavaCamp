package kodlamaioOdev;

public class Main {

	public static void main(String[] args) {

		Lesson lesson1 = new Lesson(1, "Yazılım Geliştirici Yetiştirme Kampı",
				"2 ay sürecek ücretsiz ve profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz.",
				"Engin Demiroğ", "Ücretsiz");
		
		Lesson lesson2 = new Lesson();
		lesson2.id = 2;
		lesson2.desc = "2 ay sürecek ücretsiz ve profesyonel bir programla, sıfırdan yazılım geliştirme öğreniyoruz.";
		lesson2.instructor = "Engin Demiroğ";
		lesson2.title = "Yazılım Geliştirici Yetiştirme Kampı (JAVA & REACT)";
		lesson2.price = "Ücretsiz";
		Lesson lesson3 = new Lesson(3, "Programlamaya Giriþ Ýçin Temel Kurs",
				"PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantığını anlaşılır örneklerle öğrenin.",
				"Engin Demiroğ", "Ücretsiz");

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
