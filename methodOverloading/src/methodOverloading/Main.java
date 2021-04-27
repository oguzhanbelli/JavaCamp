package methodOverloading;

public class Main {

	public static void main(String[] args) {
		dortIslem dortislem = new dortIslem();
		int sonuc = dortislem.topla(3, 5);
		int sonuc2 = dortislem.topla(3, 5,6);//METHOD OVERLOADÝNG
		System.out.println(sonuc);
		System.out.println(sonuc2);
	}

}
