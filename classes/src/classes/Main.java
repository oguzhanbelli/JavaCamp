package classes;

public class Main {

	public static void main(String[] args) {
		//reference type
	CustomerManager customerManager;//reference ilk ba�ta 101
	CustomerManager customerManager2 = new CustomerManager();//reference ilk ba�ta 102
	customerManager = customerManager2;//e�itleme yap�ld���nda ikisinin de 102 olur ve ayn� i�levi yapar.
	customerManager.Add();
	customerManager.Delete();
	customerManager.Update();

	//premetive int float byte stackte tutar e�itlemeden sonra de�i�tirmez.
	int sayi1 = 10;
	int sayi2 = 20;
	sayi2 = sayi1;//say� 2 nin de�eri e�ittir say� 1 in de�eri.
	sayi1 = 30;
	System.out.println(sayi2);//Sonu� 10;
	//Diziler referans tiptir!!!!! e�itlemeden sonra heapi de�i�tirir.
	int[] sayilar1 = new int[] {1,2,3};
	int[] sayilar2 = new int[] {4,5,6};
	sayilar2 = sayilar1;
	sayilar1[0] =10;
	System.out.println(sayilar2[0]);
	}

}


