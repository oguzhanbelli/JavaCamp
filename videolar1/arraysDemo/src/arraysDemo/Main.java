decode UTF-8
package arraysDemo;

public class Main {
	public static void main(String[] args) {
		String ogrenci1= "Engin";
		String ogrenci2="Derin";
		String ogrenci3="Salih";
		System.out.println("Aynı Tip Normal Değişken"+ogrenci1);
		System.out.println("Aynı Tip Normal Değişken"+ogrenci2);
		System.out.println(("Aynı Tip Normal Değişken"+ogrenci3));
		
		String[] ogrenciler = {"Engin","Salih","Derin"};
		
		for(String ogrenci : ogrenciler) {
			System.out.println("Array "+ogrenci);
		}
		
		for(int i = 0; i<ogrenciler.length; i++) {
			System.out.println("Array 2. Kullanım "+ogrenciler[i]);
		}
		
		int[] numaralar = {1,2,3,4};
		for(int numara:numaralar) {
			System.out.println(numara);
		}
	}

}
