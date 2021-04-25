package miniProjeAsalSayi;

public class Main {
	public static void main(String[] args) {
		
		
		int number = 7;
		int remainder = number %2;
		
		boolean isPrime = true;
		if(number == 1) {
			System.out.println("En küçük asal sayý 2'dir");
			return;
		}
		if(number <2) {
			System.out.println("Geçersiz Sayý");
		}else {
			for(int i = 2; i<number; i++) {
				if(number %i == 0) {
					isPrime = false;
					
				}
			}
				
				if(isPrime) {
					
					System.out.println("Sayý Asaldýr");
				}else {
					System.out.println("Sayý Asal Deðildir");
				}
		}
		
		}
		
	}


