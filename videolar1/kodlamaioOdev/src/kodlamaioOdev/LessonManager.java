package kodlamaioOdev;

public class LessonManager {
	public void EnterTheProgram(int lessonId,String lessonTitle) {
		this.lessonId = lessonId;
		this.lessonTitle = lessonTitle;
		
		System.out.println(lessonId+" Numaral� "+lessonTitle+" "+"Program�na Dahil Oldunuz.");
	}
	public void QuitTheProgram(int lessonId,String lessonTitle) {
		this.lessonId = lessonId;
		this.lessonTitle = lessonTitle;
		
		System.out.println(lessonId+" Numaral� "+lessonTitle+" "+"Programdan ��k�� Yapt�n�z.");
	}
	
	
	int lessonId;
	String lessonTitle;

}
