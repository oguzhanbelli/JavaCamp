package stringDemo;

public class Main {
	public static void main(String[] args) {
		String mesaj = "Bug�n hava �ok g�zel.";
		System.out.println(mesaj);
//		System.out.println("Eleman Say�s� " + mesaj.length());
//		System.out.println("5. Eleman" + mesaj.charAt(4));
//		System.out.println(mesaj.concat(" Ya�as�n"));
//		String mesaj2 = mesaj.concat("Ya�as�n");
//		System.out.println(mesaj + mesaj2);
//		System.out.println(mesaj.startsWith("c"));// ba�l�yor mu java k���k b�y�k harf duyarl� bir dildir.
//		System.out.println(mesaj.endsWith("."));// bitiyor mu
//		
//		//get chars e�itleme
//		char[] karakterler = new char[5];
//		mesaj.getChars(0, 5, karakterler, 0);
//		System.out.println(karakterler);
//		//ka��nc� karakter bulma ilk buldu�unu verir
//		System.out.println(mesaj.indexOf("va"));
//		System.out.println(mesaj.indexOf('a'));
//		
//		//aramaya sa�dan ba�lar
//		System.out.println(mesaj.lastIndexOf('a'));

//	}

		System.out.println(mesaj.replace('a', 'b'));
		System.out.println(mesaj.replace(' ', '-'));
		System.out.println(mesaj.replace("hava", "weather"));

		// replace atama
		String yenimetin = mesaj.replace('a', 'b');
		System.out.println(yenimetin);
		// biti�
		// Par�alay�p almak
		System.out.println(yenimetin.substring(0, 5));
		// 2 index den ba�la
		System.out.println(yenimetin.substring(2));
		// par�ala ve 4e kadar kes

		System.out.println(yenimetin.substring(2, 5));
		// bo�lu�a g�re ay�rma for d�ng�s� ile
		for (String kelime : yenimetin.split(" ")) {
			System.out.println(kelime);

		}
		// k���k harfe �evirme aramalarda s�kl�kla kulla�l�r
		System.out.println(yenimetin.toLowerCase());
        // b�y�k harfe �evirme
		System.out.println(yenimetin.toUpperCase());
		//ba��ndaki ve sonundaki bo�luklar� siler.
		System.out.println(mesaj.trim());
	}
}
