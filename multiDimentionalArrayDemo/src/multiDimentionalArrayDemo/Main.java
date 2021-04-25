package multiDimentionalArrayDemo;

public class Main {
	public static void main(String[] args) {
		String[][] sehirler = new String[3][3];
		sehirler[0][0] = "Ýstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Yozgat";
		sehirler[1][2] = "Konya";
		sehirler[2][0] = "Van";
		sehirler[2][1] = "Muþ";
		sehirler[2][2] = "Diyarbakýr";
		
		for(int i = 0; i <=2 ;i++) {
			System.out.println("-----------------------");
			System.out.println(i);
			for(int j = 0;  j<=2; j++) {
				System.out.println(j);
				System.out.println(sehirler[i][j]);
			}
			
		}
		

	}

}
