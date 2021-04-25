package kodlamaioOdev;

public class LessonManager {
	public void EnterTheProgram(int lessonId,String lessonTitle) {
		this.lessonId = lessonId;
		this.lessonTitle = lessonTitle;
		
		System.out.println(lessonId+" Numaralý "+lessonTitle+" "+"Programýna Dahil Oldunuz.");
	}
	public void QuitTheProgram(int lessonId,String lessonTitle) {
		this.lessonId = lessonId;
		this.lessonTitle = lessonTitle;
		
		System.out.println(lessonId+" Numaralý "+lessonTitle+" "+"Programdan Çýkýþ Yaptýnýz.");
	}
	
	
	int lessonId;
	String lessonTitle;

}
