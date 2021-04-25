package stringDemo;

public class Main {
	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);
//		System.out.println("Eleman Sayýsý " + mesaj.length());
//		System.out.println("5. Eleman" + mesaj.charAt(4));
//		System.out.println(mesaj.concat(" Yaþasýn"));
//		String mesaj2 = mesaj.concat("Yaþasýn");
//		System.out.println(mesaj + mesaj2);
//		System.out.println(mesaj.startsWith("c"));// baþlýyor mu java küçük büyük harf duyarlý bir dildir.
//		System.out.println(mesaj.endsWith("."));// bitiyor mu
//		
//		//get chars eþitleme
//		char[] karakterler = new char[5];
//		mesaj.getChars(0, 5, karakterler, 0);
//		System.out.println(karakterler);
//		//kaçýncý karakter bulma ilk bulduðunu verir
//		System.out.println(mesaj.indexOf("va"));
//		System.out.println(mesaj.indexOf('a'));
//		
//		//aramaya saðdan baþlar
//		System.out.println(mesaj.lastIndexOf('a'));

//	}

		System.out.println(mesaj.replace('a', 'b'));
		System.out.println(mesaj.replace(' ', '-'));
		System.out.println(mesaj.replace("hava", "weather"));

		// replace atama
		String yenimetin = mesaj.replace('a', 'b');
		System.out.println(yenimetin);
		// bitiþ
		// Parçalayýp almak
		System.out.println(yenimetin.substring(0, 5));
		// 2 index den baþla
		System.out.println(yenimetin.substring(2));
		// parçala ve 4e kadar kes

		System.out.println(yenimetin.substring(2, 5));
		// boþluða göre ayýrma for döngüsü ile
		for (String kelime : yenimetin.split(" ")) {
			System.out.println(kelime);

		}
		// küçük harfe çevirme aramalarda sýklýkla kullaýlýr
		System.out.println(yenimetin.toLowerCase());
        // büyük harfe çevirme
		System.out.println(yenimetin.toUpperCase());
		//baþýndaki ve sonundaki boþluklarý siler.
		System.out.println(mesaj.trim());
	}
}
