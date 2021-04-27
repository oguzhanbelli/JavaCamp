package kodlamaioOdev;

public class LessonManager {
	public void enterTheProgram(int lessonId,String lessonTitle) {
		this.lessonId = lessonId;
		this.lessonTitle = lessonTitle;
		
		System.out.println(lessonId+" Numaralý "+lessonTitle+" "+"Programına Dahil Oldunuz.");
	}
	public void quitTheProgram(int lessonId,String lessonTitle) {
		this.lessonId = lessonId;
		this.lessonTitle = lessonTitle;
		
		System.out.println(lessonId+" Numaralý "+lessonTitle+" "+"Programdan Çıkış Yaptınız.");
	}
	
	
	int lessonId;
	String lessonTitle;

}
