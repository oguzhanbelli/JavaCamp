package mukemmelSayi;

public class Main {
	public static void main(String[] args) {
		int sayi = 496;
		int toplam = 0;
		for(int i = 1; i<sayi; i++) {
			if(sayi %i == 0) {
				 toplam += i;
			}
		}
			if(sayi == toplam) {
				System.out.println("M�kemmel Say�d�r");
				
			}else {
				System.out.println("M�kemmel say� de�ildir");
			}
		}
	}

