package classes;

public class Main {

	public static void main(String[] args) {
		//reference type
	CustomerManager customerManager;//reference ilk baþta 101
	CustomerManager customerManager2 = new CustomerManager();//reference ilk baþta 102
	customerManager = customerManager2;//eþitleme yapýldýðýnda ikisinin de 102 olur ve ayný iþlevi yapar.
	customerManager.Add();
	customerManager.Delete();
	customerManager.Update();

	//premetive int float byte stackte tutar eþitlemeden sonra deðiþtirmez.
	int sayi1 = 10;
	int sayi2 = 20;
	sayi2 = sayi1;//sayý 2 nin deðeri eþittir sayý 1 in deðeri.
	sayi1 = 30;
	System.out.println(sayi2);//Sonuç 10;
	//Diziler referans tiptir!!!!! eþitlemeden sonra heapi deðiþtirir.
	int[] sayilar1 = new int[] {1,2,3};
	int[] sayilar2 = new int[] {4,5,6};
	sayilar2 = sayilar1;
	sayilar1[0] =10;
	System.out.println(sayilar2[0]);
	}

}


