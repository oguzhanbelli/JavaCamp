package miniProjeAsalSayi;

public class Main {
	public static void main(String[] args) {
		
		
		int number = 7;
		int remainder = number %2;
		
		boolean isPrime = true;
		if(number == 1) {
			System.out.println("En küçük asal sayı 2'dir");
			return;
		}
		if(number <2) {
			System.out.println("Geçersiz Sayı");
		}else {
			for(int i = 2; i<number; i++) {
				if(number %i == 0) {
					isPrime = false;
					
				}
			}
				
				if(isPrime) {
					
					System.out.println("Sayı Asaldır");
				}else {
					System.out.println("Sayı Asal Değildir");
				}
		}
		
		}
		
	}


