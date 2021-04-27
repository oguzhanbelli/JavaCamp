package methods2;

public class Main {

	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		String yeniMesaj = mesaj.substring(0,2);//başlangıç dahil bitiş dahil değil.
		System.out.println(yeniMesaj);
		sehirVer();
		//variable arguments
		int sayi = topla(5,7);
		System.out.println(sayi);
		int toplam = topla2(2,3,4,5,6);
		System.out.println(toplam);
	}

	public static void ekle() {
		System.out.println("Eklendi");

	}

	public static void sil() {//void fonksiyonlarda return döndürmek zorunda değiliz.
		System.out.println("Silindi");
	}

	public static void guncelle() {
		System.out.println("Güncellendi");

	}
	//variable arguments
	public static int topla(int sayi1,int sayi2) {//int fonksiyonlarda return döndürme yapmak zorundayız.
		return sayi1+sayi2;
		
	}
public static String sehirVer() {
	return "Ankara";
		
	}
//variable arguments
public static int topla2(int... sayilar) {
	int toplam = 0;
	for(int sayi :sayilar) {
		toplam += sayi;
		
	}
	return toplam;
}


}
