package methods;

public class Main {

	public static void main(String[] args) {
		sayiBulmaca(8);

	}
	
	public static void sayiBulmaca(int gelensayi) {
		int[] sayilar = new int[] {1,2,5,7,9,0};
		int aranacak = gelensayi;
		boolean varMi = false;
		for(int sayi : sayilar) {
			if(sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		
		if(varMi) {
			mesajVer("Sayı Mevcuttur"+ aranacak);
			
		}else {
			mesajVer("Sayı Mevcut Değildir"+ aranacak);
		}
		
	
		
	}
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
